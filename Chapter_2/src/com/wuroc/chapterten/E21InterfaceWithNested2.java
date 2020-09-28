//E21InterfaceWithNested2.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
interface I{
	void f();
	void g();
	class Nested {
		static void call(I impl) {
			System.out.println("Calling I.f()");
			impl.f();
			System.out.println("Calling I.g()");
			impl.g();
		}
	}
}
public class E21InterfaceWithNested2 {
	public static void main(String[] args) {
		//匿名类
		/*
		 * 请注意，我们使用匿名内部类来实现接口I。 
		 * 通常更清楚的是列出接口的所有方法，
		 * 然后定义嵌套类。
		 */
		I impl = new I() {
			public void f() {}
			public void g() {}
		};
		
		I.Nested.call(impl);
	}
}
/*
 * Calling I.f() 
 * Calling I.g()
 */
