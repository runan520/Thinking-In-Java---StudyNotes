//: E03_Aliasing2.java

package com.wuroc.chapterthree;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月1日
 *
 * 
 */
public class E03_Aliasing2 {
	//Integral 在一个包下类可以用E02_Aliasing类
	static void f(Integral y) { 
		
		y.f = 1.0f;
		
		} 
	public static void main(String[] args) {
		
		Integral x = new Integral();
		
		x.f = 2.0f;
		
		print("1: x.f: " + x.f);
		
		f(x);
		
		print("2: x.f: " + x.f);
		
		}
	
		} /* Output: 1: x.f: 2.0
		2: x.f: 1.0
		*///:~


