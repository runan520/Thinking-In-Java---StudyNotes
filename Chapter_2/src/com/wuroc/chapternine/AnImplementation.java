package com.wuroc.chapternine;

public class AnImplementation implements AnInterface {

	@Override
	public void firstMethod() {
		System.out.println("firstMethod");
		
	}

	@Override
	public void secondMethod() {
		System.out.println("secondMethod");
	}
	
	public static void main(String[] args) {
		AnInterface i = new AnImplementation();
		i.firstMethod();
		i.secondMethod();
	}

}

/* 如果我们在AnInterface中添加一个新的方法newMethod()

 * The type AnImplementation must 
 * implement the inherited abstract method
 * AnInterface.newMethode()
 */




