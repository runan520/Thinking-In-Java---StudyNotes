//: Varargtype.java

package com.wuroc.chapterfive;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月14日
 * 
 * 
 */
public class Varargtype {
	static void f(Character... args) {
		printnb(args.getClass());
		print("length " + args.length);
			
	}
	static void g(int... args) {
		System.out.print(args.getClass());
		System.out.println(" length " + args.length);
		
	}
	
	public static void main(String[] args) {
		f('a');
		f();
		g(1);
		g();
		System.out.println("int[]: " + new int[0].getClass());
	}

}
