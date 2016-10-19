package org.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler{
	
	private Object aspect;
	
	public Object bind(Object o){
		this.aspect = o;
		return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), this);
	}
	
	public DynamicProxy(){
		
	}
	
	public DynamicProxy(Object aspect){
		this.aspect = aspect;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		 Object result = null;
		 if(method.getName().equals("running")){
	        System.out.println("事物开始");  
	        //执行方法  
	        result=method.invoke(aspect, args);  
	        System.out.println("事物结束");  
		 }
	        return result;  
	}

}
