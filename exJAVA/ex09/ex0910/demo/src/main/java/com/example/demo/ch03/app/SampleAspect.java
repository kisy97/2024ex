package com.example.demo.ch03.app;

import java.text.SimpleDateFormat;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect {
	/*
	 * @Before("execution(* com.example.demo.ch03.used.*Greet.*(..))") public void
	 * beforeAdvice(JoinPoint joinpoint) {
	 * System.out.println("------Before Advice-------");
	 * 
	 * System.out.println(new SimpleDateFormat("yyyy/mm/dd").format(new
	 * java.util.Date()));
	 * 
	 * System.out.println(String.format("메서드:%s",
	 * joinpoint.getSignature().getName())); }
	 */
	
	/*
	 * @After("execution(* com.example.demo.ch03.used.*Greet.*(..))") public void
	 * afterAdvice(JoinPoint joinpoint) {
	 * System.out.println("------After Advice-------");
	 * 
	 * System.out.println(new SimpleDateFormat("yyyy/mm/dd").format(new
	 * java.util.Date()));
	 * 
	 * System.out.println(String.format("메서드명:%s",
	 * joinpoint.getSignature().getName())); }
	 */
	
	@Around("execution(* com.example.demo.ch03.used.*Greet.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("------Around Advice-------");
		System.out.println("▼▼▼ 처리전 ▼▼▼");
		
		Object result = joinPoint.proceed();
		System.out.println("▲▲▲ 처리후 ▲▲▲");
		
		return result;
	}
}
