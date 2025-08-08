package com.wipro.mohanachandra.quizappmonorepo.exception;

@SuppressWarnings("serial")
public class QuestionNotFoundException extends RuntimeException{

	public QuestionNotFoundException(String message) {
		super(message);
	}
	
}
