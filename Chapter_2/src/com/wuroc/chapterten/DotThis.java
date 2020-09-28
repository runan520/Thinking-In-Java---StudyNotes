//DotThis.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */

public class DotThis {
	void f(){
		System.out.println("DotThis.f()");
	}
	
	public class Inner {
		public DotThis Outer(){
			return DotThis.this;
		}
	}
		
	public Inner inner() {
		return new Inner();
	}
	
	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.Outer().f();
	}
}






