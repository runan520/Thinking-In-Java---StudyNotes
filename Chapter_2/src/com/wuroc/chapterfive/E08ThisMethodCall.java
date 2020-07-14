//: E08ThisMethodCall.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月10日
 *
 * 
 */
public class E08ThisMethodCall {
	public void a() {
		b();
		this.b();
	}
	
	public void b() {
		
		System.out.println("b() called");
		
	}
	
	public static void main(String[] args) {
		
		new E08ThisMethodCall().a();
	
	}
}

