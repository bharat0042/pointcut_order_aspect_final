package com.bharat.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class LoggingDemoAspect {

	//@Before("execution(public void add*())") 
	//@Before("execution(boolean add*())") 
	//@Before("execution(* add*())") 
	//@Before("execution(* add*(com.bharat.aopdemo.Account))") 
	//@Before("execution(* add*(..))") 
	//@Before("execution(* com.bharat.aopdemo.dao.*.*(..))")
	@Before("com.bharat.aopdemo.aspect.AOPDemoExpressions.forDAOPackageWithoutGetterOrSetter()")
	public void addBeforeAccountAdvice(){
		System.out.println("=========>LoggingDemoAspect: This is an @Before advice");
	}
}
