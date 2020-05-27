package com.car.test;

import java.io.IOException;

import com.car.beans.Car;
import com.car.beans.MessageConverter;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Car car=new Car();
		System.out.println(car.start());
		MessageConverter converter = new MessageConverter();
		converter.convertMessage();

	}

}
