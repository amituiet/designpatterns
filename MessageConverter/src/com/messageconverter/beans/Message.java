package com.messageconverter.beans;

public class Message{
	private MessageConverter messageConverter;
	private String messageName;
	

	public Message(MessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}
	
	public MessageConverter getMessageConverter() {
		return messageConverter;
	}

	public void setMessageConverter(MessageConverter messageConverter) {
		this.messageConverter = messageConverter;
		this.messageName = "inserteted : " + messageConverter.getClass().getName();
	}

	public void printMessage(String message) {
		messageConverter.messageConverter(message);
		System.out.println("Message : " + message);
		
	}
}
