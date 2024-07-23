package com.jdc.demo.app;

import com.jdc.demo.app.exceptions.ApplicationExcecption;
import com.jdc.demo.app.exceptions.ApplicationExcecption.Type;
import com.jdc.demo.app.exceptions.DataAccessException;

public class ModelClass {

	private DataAccessClass dao = new DataAccessClass();

	public String[] search(String param) {
		try {
			return dao.search(param);
		} catch (DataAccessException e) {
			throw new ApplicationExcecption(Type.Error, "Error on data access class.", e);
		}
	}

}
