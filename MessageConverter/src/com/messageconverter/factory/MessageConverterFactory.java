package com.messageconverter.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.messageconverter.beans.HTMLMessageConverter;
import com.messageconverter.beans.MessageConverter;
import com.messageconverter.beans.PDFMessageConverter;

public class MessageConverterFactory {
	
	public MessageConverter getBean() throws IOException {
	   
		Properties props=new Properties(); 
		//InputStream is = MessageConverterFactory.class.getClassLoader().getResourceAsStream("com/messageconverter/common/appClasses.properties");
		
		InputStream is = MessageConverterFactory.class.getClassLoader().getResourceAsStream("appClasses.properties");
		props.load(is); 
	    System.out.println(props.get("messageConverter"));
	    props.setProperty("amit", "Prity");
	    
	    System.out.println(props.get("amit"));
	    String converterName = (String) props.get("messageConverter");
	    //String converterName = name;
	
	    if(converterName.equals("PDF")) {
			return new PDFMessageConverter();	
		}
				
		return new HTMLMessageConverter();
	}
}
