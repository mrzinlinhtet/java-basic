package com.jdc.demo.before;

public enum EnumDaysOfWeek {

	MON(1, "Monday"), TUE(2, "Tuesday"), WED(3, "Wednesday"), THU(4, "Thursday"), FRI(5, "Friday"), SAT(6, "Saturday"),
	SUN(7, "Sunday");

	private String displayName;
	private int value;

	private EnumDaysOfWeek(int value, String displayName) {
		this.value = value;
		this.displayName = displayName;

	}

	public int getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

}
