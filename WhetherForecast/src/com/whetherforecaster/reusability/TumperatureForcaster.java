package com.whetherforecaster.reusability;

public class TumperatureForcaster implements ForeCaster{
	
public String getTumperature(String vendor) {
		
		return vendor+" : wheather forecaster";
	}

@Override
public String foreCast(String vendor) {
	// TODO Auto-generated method stub
	return vendor+" : tumperature forecaster";
}

}
