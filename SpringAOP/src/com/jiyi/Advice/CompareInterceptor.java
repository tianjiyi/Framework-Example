package com.jiyi.Advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CompareInterceptor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		Object result = null;
		String studentName = arg0.getArgument(0).toString();
		if(studentName.equals("jiyi")){
			result = arg0.proceed();
		}else{
			System.out.println("You are not on the whiteList");
		}
		
		// TODO Auto-generated method stub
		return result;
	}

}
