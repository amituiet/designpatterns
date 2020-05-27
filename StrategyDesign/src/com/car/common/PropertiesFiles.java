package com.car.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.car.beans.Car;

public class PropertiesFiles {
	public static  Properties getProperty() throws IOException {
		Properties props = new Properties();
		InputStream is = Car.class.getClassLoader().getResourceAsStream("com/car/common/carprop.properties");
		props.load(is);
		//System.out.println(props.hashCode());
		return props;
		
	}
}
