//Callbacks.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
interface Incrementable {
	void increment();
}

class Callee1 implements Incrementable {
	private int i = 0;
	@Override
	public void increment() {
		i++;
		System.out.println(i);
	}
}
class MyIncrement {
	public void increment() {
		System.out.println("Other operation");
	}
	static void f(MyIncrement mi) {
		mi.increment();
	}
}
class Callee2 extends MyIncrement {
	private int i = 0;
	@Override
	public void increment() {
		super.increment();
		i++;
		System.out.println(i);
	}
	
	private class Closure implements Incrementable {
		@Override
//		指定外部类方法，否则
//		您将获得无限递归：
		public void increment() {
			//这里会回调到外部类Callee2的increment()的方法
			Callee2.this.increment();
			
		}
	}
	Incrementable getCallbackReference() {

		return new Closure();
	}
}
class Caller {
	private Incrementable callbackReference;
	Caller(Incrementable cbh) {
		callbackReference = cbh;
	}
	void go() {
		callbackReference.increment();
	}
	
}
public class Callbacks {
	public static void main(String[] args) {
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		//static void f(MyIncrement mi)
		MyIncrement.f(c2);	
		//class Callee1 implements Incrementable
		Caller caller1 = new Caller(c1);
		//return new Closure()  //回调
		Caller caller2 = new Caller(c2.getCallbackReference());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}
}





