//: Exponents.java

package com.wuroc.chapterthree;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月2日
 *
 * 
 */
public class Exponents {
	
	
	
	public static void main(String[] args) {
		
		//大小写e是相同的
		//1.39×10`-43
		float expFloat = 1.39e-43f;
		
		float expFloat2 = 1.39E-43f;
		
		System.out.println(expFloat==expFloat2);
		System.out.println(expFloat);
		double expDouble = 47e47d;
		//Automatically double 自动转换为double
		double expDouble2 = 47e47;   
		
		System.out.println(expDouble==expDouble2);
		System.out.println(expDouble);
	
		
	}

}/* Output:
true
true
*///:~
