package org.proxy;

import org.aspect.Benz;
import org.aspect.Car;

/**
 * 比如我们现在要出行
 * @author lenovo
 *
 */
public class StaticProxy implements Car{
	private Benz benz;
	
	public StaticProxy(Benz benz){
		this.benz = benz;
	}

	@Override
	public void running() {
		System.out.println("Turn on the car");
		benz.running();
		System.out.println("Turn off the car");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		
	}
	
}
