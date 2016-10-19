package org.aspect;

import java.util.Date;

public class LogPrint {
	
	private static LogPrint log = new LogPrint(); 
	public static LogPrint getInstance(){
		return log;
	}
	public void print(){
		Date now = new Date(); 
		System.out.println(Thread.currentThread().getName() +"Time:"+now.toString() );
	}
}
