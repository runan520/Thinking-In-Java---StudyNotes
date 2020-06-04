//: PracticeOne .java
/****************** Exercise 1 *****************
*	Create a class containing an int and a char
*	that are not initialized. Print their values
*	to verify that Java performs default
*	initialization.
***********************************************/
package com.wuroc.chaptertwo;

/**
 * @author HepengWu
 * @author www.github.com/WuRoc
 * @version 1.0
 * @2020年5月29日
 *
 * 
 */
public class PracticeOne {
//	定义static是因为在"局部"变量用到了
//	因为初始化的方法不适用“局部”变量
	/* static一种情况是，只想为某特定域分配单一储存空间，
	 * 而不去考虑究竟需要创多少个对象
	 *  */
	static int i;
	static char c;
	static float f;
	static byte B;
	static double d;
	static long l;
	static boolean b;
//	    -----------------------------------
//	public static void main(String[] args){
//		PracticeOne p =new PracticeOne();
//		System.out.println("i = ["+p.i+"]");  
//		System.out.println("c = ["+p.c+"]"); 
//}
//		-------------------------------------
//第二种写法
//	public PracticeOne(){
//	System.out.println("i = ["+i+"]");  
//	System.out.println("c = ["+c+"]"); 
//	}
//	public static void main (String[] args) {
//		new PracticeOne();
//	}
//	Three
	static void ic() {
		//如果定义的是static ，i,也要定义static
		System.out.println("i = ["+i+"]");    
		System.out.println("c = ["+c+"]"); 
		System.out.println("f = ["+f+"]");
		System.out.println("B =["+B+"]");
		System.out.println("d =["+d+"]");
		System.out.println("l =["+l+"]");
		System.out.println("b =["+b+"]");
	}
	public static void main (String[] args) {
		PracticeOne.ic();
	}
		
	

} /* Output:
i = [0]   int的基本类型默认值是0
c = [ ]  char的基本类型默认值是 空格
f = [0.0]
B =[0]
d =[0.0]
*///:~

//---------------------------------------


 



