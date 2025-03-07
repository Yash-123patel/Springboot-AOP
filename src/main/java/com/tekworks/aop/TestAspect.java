package com.tekworks.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class TestAspect {

	@Before("execution(* com.tekworks.service.UserService.displayUserName(..))")
	public void testBeforeMethod(JoinPoint obj) {
		log.info("before printing username.....{}",obj.getArgs().length);
	}
	
	@After("execution(* com.tekworks.service.UserService.displayUserName(..))")
	public void testAfterMethod() {
		log.info("After printing username.....");
	}
	
	 @Around("execution(* com.tekworks.service.UserService.*(..))")
	 public void testAroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
	        log.info("Before executing method: " + joinPoint.getSignature().getName());
	        
	        joinPoint.proceed();
	        
	        log.info("After executing method: " + joinPoint.getSignature().getName());
	        
	        
	    }
	 @AfterThrowing(pointcut = "execution(* com.tekworks.service.UserService.displayExceptionName(..))", throwing = "ex")
	    public void handleException(Exception ex) {
	        log.error("An exception occurred: " + ex.getMessage());
	    }
	}