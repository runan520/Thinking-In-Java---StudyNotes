//: E14CompareStrings.java

package com.wuroc.chapterthree;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月5日
 *
 * 
 */
public class E14CompareStrings {
	
	public static void p(String s, boolean b) {
		
		System.out.println(s + ": " + b);
		
		
	}
	
	public  static void compare(String lval, String rval) {

		System.out.println("lval: " + lval + " rval: " + rval);
		//字符串没办法直接使用大于，小于
		//! p("lval < rval: " + lval < rval);
		//! p("lval > rval: " + lval > rval);
		 

		//! p("lval <= rval: " + lval <= rval);
		//! p("lval >= rval: " + lval >= rval);
		p("lval == rval", lval == rval); 
		p("lval != rval", lval != rval);
		p("lval.equals(rval)", lval.equals(rval));
		
		

	}
	public static void main(String[] args) {
		
		compare("Hello", "WuRoc");
		compare("Hello", "Goodbye");
		compare("Hello", "Hello");
		
	}
	
	
	
	
	
	
	

}
