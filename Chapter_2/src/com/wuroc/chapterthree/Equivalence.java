//: Equivalence.java

package com.wuroc.chapterthree;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月1日
 *
 * 
 */
public class Equivalence {
	
	public static void main(String[] args) {
		
		Integer n1 = new Integer(47);
		
		Integer n2 = new Integer(47);
		//== != 比较的是对象的引用  
		System.out.println(n1 == n2);
		
		System.out.println(n1 != n2);
		
		
	}

}/* Output
false
true
*///:~
