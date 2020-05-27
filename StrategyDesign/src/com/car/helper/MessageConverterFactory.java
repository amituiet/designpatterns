package com.car.helper;

import javax.swing.text.html.HTML;

import com.car.beans.HTMLMessageConverter;
import com.car.beans.IMessageConverter;
import com.car.beans.PDFMessageConverter;

public class MessageConverterFactory {
	public static IMessageConverter create(String messageType) {
		if(messageType.equals("PDF"))
			return new PDFMessageConverter();
		else if(messageType.equals("HTML"))
			return new HTMLMessageConverter();
		return null;
	}

}
