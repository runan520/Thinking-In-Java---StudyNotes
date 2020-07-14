//: OverloadingVararg2.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月14日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class OverloadingVararg2 {
	static void f(float i, Character... args) {
		System.out.println("first");
	}
	static void f(Character... args) {
		System.out.println("second");
	}
	public static void main(String[] args) {
		f(1, 'a');
		//需要添加非可变参数
//		f('a', 'b');
	}

}
