package com.whetherforecaster.test;

import com.whetherforecaster.reusability.ForeCaster;
import com.whetherforecaster.reusability.IBMwheatherForcaster;
import com.whetherforecaster.reusability.OracleWheatherForcaster;
import com.whetherforecaster.reusability.TumperatureForcaster;
import com.whetherforecaster.reusability.WheatherForcaster;

public class WheatherForcasting {

	public static void main(String[] args) {

		OracleWheatherForcaster oracleWheatherForcaster = new OracleWheatherForcaster();
		
		//Tightely coupling with the class name...
		IBMwheatherForcaster ibmwheatherForcaster = new IBMwheatherForcaster();
		System.out.println(oracleWheatherForcaster.getTumperature());
		//System.out.println(oracleWheatherForcaster.getTumperature(10));
		
		/*ForeCaster ibmwheatherForcaster = new IBMwheatherForcaster();
		System.out.println(ibmwheatherForcaster.getTumperature());*/
		//System.out.println(oracleWheatherForcaster.foreCast("Oracle"));
		
		ForeCaster wheatherForcaster = new TumperatureForcaster();
		
		System.out.println(wheatherForcaster.foreCast("Oracle"));
		
		
		
		
	}

}
