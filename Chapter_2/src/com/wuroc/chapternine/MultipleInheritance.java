package com.wuroc.chapternine;

interface One {
	default void first() {
		System.out.println("first");
	}

}

interface Two {
	default void second() {
		System.out.println("second");
	}
}

interface Three{
	default void third() {
		System.out.println("third");
	}
}

class MI implements One, Two, Three{
	
}
public class MultipleInheritance {
	public static void main(String[] args) {
		MI mi = new MI();
		mi.first();
		mi.second();
		mi.third();
	}
	
}

/*
 * 因为接口中仍然不允许存在属性（只有静态属性， 不适用）。 
 * 所以属性仍然只会来自单个基类或抽象类，
 * 也就是说，不会存在状态的多继承。
 */
/*Output:
 * firstMethod 
 * secondMethod 
 * newMethod
 *///WuRoc
