package com.jdc.demo.usage.processor;

import java.util.ArrayList;

import com.jdc.demo.usage.NotBlank;
import com.jdc.demo.usage.NotNull;

public class FieldsValidator {

	public static void validate(Object object) {

		var messages = new ArrayList<String>();
		var fields = object.getClass().getDeclaredFields();

		for (var field : fields) {
			var notBlank = field.getDeclaredAnnotation(NotBlank.class);

			if (null != notBlank) {
				try {
					field.setAccessible(true);
					var value = field.get(object);

					if (null == value) {
						messages.add(notBlank.value());
					}

					if (null != value && value instanceof String str && str.isBlank()) {
						messages.add(notBlank.value());
					}
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
			var notNull = field.getDeclaredAnnotation(NotNull.class);

			if (null != notNull) {
				try {
					var value = field.get(object);

					if (null == value) {
						messages.add(notNull.value());
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		if (!messages.isEmpty()) {
			throw new FieldsValidationException(messages);
		}
	}
}
