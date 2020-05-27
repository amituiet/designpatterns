package com.messageconverter.beans;

public class HTMLMessageConverter implements MessageConverter{
	
public String messageConverter(String message) {
		
		System.out.println("HTML Message Converter");
		
		return "HTML Message Converter : "+ message;
	}
}