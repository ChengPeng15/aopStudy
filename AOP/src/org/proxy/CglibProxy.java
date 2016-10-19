package org.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {

	private Object target;  
	private String className;
	private String methodName;
	  
    /** 
     * 创建代理对象 
     *  
     * @param target 
     * @return 
     */  
	public CglibProxy(){
		
	}
	
	public CglibProxy(String className,String methodName){
		this.className = className;
		this.methodName = methodName;
	}
	
    public Object getInstance(Object target) {  
        this.target = target;  
        Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(this.target.getClass());  
        // 回调方法  
        enhancer.setCallback(this);  
        // 创建代理对象  
        return enhancer.create();  
    }  
    
	@Override
	 public Object intercept(Object obj, Method method, Object[] args,  
	            MethodProxy proxy) throws Throwable {  
		
	        Class cls = Class.forName(className);
	        Method advice = cls.getMethod(methodName);
	        advice.invoke(cls.newInstance());
	        System.out.println(obj.getClass().getName());
	        proxy.invokeSuper(obj, args);  
	        
	        
	        System.out.println("事物结束");  
	        
	        
	        return null;  
	}
	
}
