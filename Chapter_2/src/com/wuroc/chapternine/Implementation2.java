package com.wuroc.chapternine;

public class Implementation2 implements InterfaceWithDefault {
	
	@Override
	public void firstMethod() {
		System.out.println("firstMethod");
	}
	
	@Override
	public void secondMethod() {
		System.out.println("secondMethod");
	}
	
	public static void main(String[] args) {
		InterfaceWithDefault i = new Implementation2();
		i.firstMethod();
		i.secondMethod();
		/*
		 * 增加默认方法的极具说服力的理由是它允许在不破坏已使用接口的
		 *  的情况下，在接口中增加新的方法。 
		 *  默认方法有时也被称为守卫方法或虚拟扩展方法
		 */
		i.newMethod();
	}

}
/* Output:
 * firstMethod 
 * secondMethod 
 * newMethod
 */
