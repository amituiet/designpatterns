package com.car.beans;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.car.common.PropertiesFiles;
import com.car.helper.CarFactory;

public class Car {
	public String start() throws IOException {
		// BMWCar car = new BMWCar();
		//AltoCar car = new AltoCar();
		
		ICarType car = (ICarType) CarFactory.getCar(PropertiesFiles.getProperty().getProperty("carType"));
		car.drive();
		PropertiesFiles pf= new PropertiesFiles();
		System.out.println(PropertiesFiles.getProperty().getClass().getName().hashCode());
		return "Car Started";
	}

}
