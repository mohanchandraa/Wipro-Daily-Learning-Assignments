package com.wipro.mohanachandra.quizappmonorepo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


import lombok.extern.slf4j.Slf4j;

@Aspect //telling spring that we are writing extra logic
@Component //Spring takes care of this class like object creation
@Slf4j
public class LoggingAspect {
	
	@Before("execution(* com.wipro.mohanachandra.quizappmonorepo.controller.QuestionController.addNewQuestion(..))")
	public void logBeforeAddQuestion() {
		log.warn("Logging something before addNewQuestion endpoint");
	}
	
	@After("execution(* com.wipro.mohanachandra.quizappmonorepo.controller.*.*(..))")
	public void logAfterControllerMethods() {
		log.info("A controller method has completed execution.");
	}


}
