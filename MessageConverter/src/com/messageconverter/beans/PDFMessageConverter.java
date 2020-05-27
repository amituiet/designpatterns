package com.messageconverter.beans;

public class PDFMessageConverter implements MessageConverter {

	public String messageConverter(String message) {
		
		System.out.println("PDF Message Converter");
		
		return "PDF Message Converter : "+ message;
	}
}
