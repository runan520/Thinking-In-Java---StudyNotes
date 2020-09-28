//InterfaceCoollision.java
package com.wuroc.chapternine;

/**
 * @author RocWu
 *
 */
interface I1{
	void f();
}
interface I2{
	int f(int i);
}
interface I3{
	int f();
}

class C {
	public int f() {
		return 1;
	}
	
}
class C2 implements I1, I2 {
	@Override
	public void f() {		
	}
	
	@Override
	public int f(int i) {
		return 1;
		
	}
}


public interface InterfaceCoollision {

}




