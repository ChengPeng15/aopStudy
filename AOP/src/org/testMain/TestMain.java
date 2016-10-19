package org.testMain;

import org.aspect.BMW;
import org.aspect.Benz;
import org.aspect.Car;
import org.aspect.LogPrint;
import org.proxy.CglibProxy;
import org.proxy.DynamicProxy;
import org.proxy.StaticProxy;

public class TestMain {
	public static void main(String[] args) {
		//有一个人有奔驰车
		Benz benz = new Benz();
		/*StaticProxy  drive = new StaticProxy(benz);
		drive.running();*/
		
/*		
		
		DynamicProxy dp = new DynamicProxy();
		Car car = (Car) dp.bind(benz);
		car.running();
		car.off();*/
		
		
/*		CglibProxy cp = new CglibProxy();
		BMW bmw = (BMW) cp.getInstance(new BMW());
		bmw.running(); */
		
		Object a = new Benz();
	    Benz benza = (Benz) a;
	    benza.running();
	   
		CglibProxy cp = new CglibProxy("org.aspect.LogPrint","print");
		BMW bmw = (BMW) cp.getInstance(new BMW());
		bmw.running();
	}
}
