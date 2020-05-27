package com.whetherforecaster.reusability;

public class IBMwheatherForcaster implements ForeCaster {

	public String getTumperature() {

		WheatherForcaster wheatherForcaster = new WheatherForcaster();
		String whetherReport = null;
		whetherReport = wheatherForcaster.foreCast("Oracle");
		return whetherReport + " : 34";
	}

	@Override
	public String foreCast(String vendor) {
		// TODO Auto-generated method stub
		return null;
	}

}
