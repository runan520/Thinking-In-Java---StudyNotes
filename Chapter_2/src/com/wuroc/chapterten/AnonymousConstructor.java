//AnonymousConstructor.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
abstract class Base{
	Base(int i){
		System.out.println("Base constructor, i = " + i);
	}
	int f(int i) {
		return i;
	}
	public abstract void f();
}
public class AnonymousConstructor {
	//在此例中，不要求变量一定是 final 的。
	//因为被传递给匿名类的基类的构造器，它并不会在匿名类
	//内部被直接使用
	public static Base getBase(int i) {
		return new Base(i) {
			{
				System.out.println("Inside instance initializer");
			}
			
			@Override
			public void f() {
				System.out.println("In anonymous f()");
			}
		};
	}
	
	public static void main(String[] args) {
		
		Base base = getBase(47);
		base.f();
	}

}
/*Output:
 * Base constructor, 
 * i = 47 Inside instance initializer 
 * In anonymous f()
 */