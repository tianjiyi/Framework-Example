package com.jiyi.aop;


import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJLogger {
	
	public static final String EDP = "execution(* com.jiyi.aop.CommonEmployee.sign*(..))";
	
	//PointCut
	@Pointcut("execution(* com.jiyi.aop.CommonEmployee.signIn())")
		private void logMessage(){}
	
	//Advice
	 @Before("logMessage()")    //spring before
	    public void logBefore() {  
	        System.out.println("logBefore:time:" + new Date());  
	    }  
	 @After(EDP)
	 	public void logAfter() {
		 	System.out.println("logAfter:time"+ new Date());
	 }
	 @Around(EDP)
	 	public Object logAround(ProceedingJoinPoint joinPoint){
		 	System.out.println("logAround Start at:" + new Date());
		 	Object[] args = joinPoint.getArgs();
		 	Object obj = null;
		 	try{
		 		obj = joinPoint.proceed(args);
		 	}catch(Throwable e){
		 		e.printStackTrace();
		 	}
		 	System.out.println("logAround End at: " + new Date()+" Employee Name: ");
		 	return obj;
		 
	 }

}
