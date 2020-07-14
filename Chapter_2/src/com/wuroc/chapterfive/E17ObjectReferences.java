//: E17ObjectReferences.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月12日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Test{
	Test(String s){
		System.out.println("String constructor; s =" + s);
		
	}
}
public class E17ObjectReferences {
	/*
	 *   此代码只创建数组，而不创建进入数组的对象。
	 *   您在Test的构造函数中没有看到初始化消息，
	 *   因为不存在该类的实例。
	 */
	Test[] array1 = new Test[5];
	public static void main(String args[]) {
		Test[] array2 = new Test[5];
	}

}
/*Output
 * 
 */
/*
 * Create a class with a constructor that takes a String argument. During
 * construction, print the argument. Create an array of object references to
 * this class, but don't create objects to assign into the array. When you run
 * the program, notice whether the initialization messages from the constructor
 * calls are printed.
 */







