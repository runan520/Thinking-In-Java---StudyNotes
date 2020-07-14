//: E02StringInitialization.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月9日
 *
 * 
 */
public class E02StringInitialization {

	String s1 = "Initialized at definition";
	String s2;
	public E02StringInitialization(String s2i) {
		s2 = s2i;
		
	}
	
	public static void main(String[] args) {
		
		E02StringInitialization si = new E02StringInitialization("Initialized at construction");
		
		System.out.println("si.s1 = " + si.s1);
		
		System.out.println("si.s2 =" + si.s2);
	}
	
}
/*Output:
 * si.s1 = Initialized at definition
 * si.s2 =Initialized at construction

 *///:WuRoc






