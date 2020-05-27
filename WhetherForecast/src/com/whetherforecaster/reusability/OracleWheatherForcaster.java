package com.whetherforecaster.reusability;

/*public class OracleWheatherForcaster extends WheatherForcaster{
	
	public String getTumperature() {
		
		String whetherReport = null;
		whetherReport  =  foreCast("Oracle");
		return whetherReport + " : 34";
	}
	
public String getTumperature(int i) {
		
		String whetherReport = null;
		whetherReport  =  foreCast("Oracle : overloading");
		return whetherReport + " : 34 :" + i;
	}
	
public String foreCast(String vendor) {
		
		return vendor+" : wheather forecaster :override";
	}

public int foreCast(String vendor) {
	//duplicacy problem....
	return vendor+" : wheather forecaster :override";
}

}*/

public class OracleWheatherForcaster {
	
	public String getTumperature() {
		
		WheatherForcaster wheatherForcaster = new WheatherForcaster();
		String whetherReport = null;
		whetherReport  =  wheatherForcaster.foreCast("Oracle");
		return whetherReport + " : 34";
	}

}
