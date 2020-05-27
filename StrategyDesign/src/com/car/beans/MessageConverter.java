package com.car.beans;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.car.common.PropertiesFiles;
import com.car.helper.MessageConverterFactory;

public class MessageConverter {
	public void convertMessage() throws IOException {
		/* Properties props = new Properties();
		InputStream is = MessageConverter.class.getClassLoader().getResourceAsStream("com/car/common/carprop.properties");
		props.load(is);
		*/
		
		IMessageConverter converter= MessageConverterFactory.create(PropertiesFiles.getProperty().getProperty("messageType"));
		System.out.println(PropertiesFiles.getProperty().getClass().getName().hashCode());
		converter.convert();
	}

}
