//: P08_StaticTest.java

package com.wuroc.chaptertwo;

/**
 * @author HepengWu
 * @author www.github.com/WuRoc
 * @version 1.0
 * @2020年6月3日
 *
 * 
 */
public class P08_StaticTest {
	
	static int i =1010;
	
	public static void main(String[] args) {
		
		P08_StaticTest p1 = new P08_StaticTest();
		
		P08_StaticTest p2 = new P08_StaticTest();
		
		System.out.println(p1.i+" == "+p2.i);
		
		p1.i++;
		
		System.out.println(p1.i + " == " + p2.i);
			
		
	} 
	

} /*Output
 1010==1010
 1011==1011
 p1.i  p2.i
///:~

/****************** Exercise 8 ******************
*	Write a program to demonstrate that no
*	matter how many objects you create of a
*	particular class, there is only one instance
*	of a particular static field in that class.
************************************************/ 

