//TestBed.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
public class TestBed {
	public void f() {
		System.out.println("void f()");
	}
	//嵌套类 
	public static class Tester {
		public static void main(String[] args) {
			TestBed t = new TestBed();
			t.f();
		}
	}

}
