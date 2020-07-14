//: OverloadingVarargs3.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月14日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class OverloadingVarargs3 {
	static void f(float i, Character... args ) {
		System.out.println("first");
	}
	static void f(char c, Character... args) {
		System.out.println("second");
	}
	
	public static void main(String[] args) {
		f(1, 'R');
		f('w','u','o');
		
	}
}
