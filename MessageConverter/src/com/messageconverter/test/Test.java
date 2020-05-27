package com.messageconverter.test;

import java.io.IOException;

import com.messageconverter.beans.Message;
import com.messageconverter.beans.MessageConverter;
import com.messageconverter.factory.MessageConverterFactory;

public class Test {

	public static void main(String[] args) throws IOException {

	//	MessageConverter massageConverter = new HTMLMessageConverter();
		MessageConverterFactory messageConverterFactory = new MessageConverterFactory();
		MessageConverter messageConverter = messageConverterFactory.getBean();
		//MessageConverter messageConverter = messageConverterFactory.getBean("PDF");
		Message message = new Message(messageConverter);
	//	message.setMessageConverter(messageConverter);
		message.printMessage("My First App");
	}

}

