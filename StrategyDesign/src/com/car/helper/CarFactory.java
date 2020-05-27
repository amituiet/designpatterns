package com.car.helper;

import com.car.beans.AltoCar;
import com.car.beans.BMWCar;
import com.car.beans.ICarType;

public class CarFactory {
	public static ICarType getCar(String carType) {
		if(carType.equals("BMW")) {
			return new BMWCar();
		}
		else if(carType.equals("Alto")){
			return new AltoCar();
			
		}
		return new AltoCar();
	}
	
}
