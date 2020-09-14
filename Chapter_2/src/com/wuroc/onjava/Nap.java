//: Nap.java

package com.wuroc.onjava;
import java.util.concurrent.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月10日
 *
 * 
 */
public class Nap {
	public Nap(double t) {
		try {
			TimeUnit.MILLISECONDS.sleep((int)(1000 * t));
		} catch(InterruptedException e){
			throw new RuntimeException(e);
		}
	}
	
	public Nap(double t, String msg) {
		this(t);
		System.out.println(msg);
	}

}






