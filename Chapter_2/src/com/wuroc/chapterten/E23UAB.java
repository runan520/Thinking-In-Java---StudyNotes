//E23UAB.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
interface U { 
	void f();
	void g();
	void h();
}
class A1 {
	public U getU() {
		return new U(){

			@Override
			public void f() {
				System.out.println("A.f");
			}

			@Override
			public void g() {
				System.out.println("A.g");
			}

			@Override
			public void h() {
				System.out.println("A.h");
			}
			
		};
	}
}
class B1 {
	U[] ua;
	public B1(int size) {
		ua = new U[size];
	}
	
	public boolean add(U elem) {
		for(int i = 0; i < ua.length; i++) {
			if(ua[i] == null) {
				ua[i] = elem; //有一个
				return true;
			}
		}
		return false;  //不能够找到空间
	}
	
	public boolean setNull(int i) {
		if(i < 0 || i > ua.length)
			return false;
		ua[i] = null;
		return true;
	}
	
	public void callMethods() {
		for(int i = 0; i < ua.length; i++)
			if(ua[i] != null) {
				ua[i].f();
				ua[i].g();
				ua[i].h();
			}
	}
}
public class E23UAB {
	public static void main(String[] args) {
		A1[] aa = {new A1(), new A1(), new A1()};
		B1 b = new B1(3); //ua数组的长度为3
		for(int i = 0; i < aa.length; i++) {
			//每次就有一个new A1()
			b.add(aa[i].getU());
			b.callMethods();
			System.out.println("******");
			b.setNull(0);
			b.callMethods();
		}
	}

}
