//: NewVarArgs.java

package com.wuroc.chapterfive;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月12日
 * 
 * 
 */

public class NewVarArgs {
	static void printArray(Object... args) {
		for(Object obj: args) {
			printnb(obj + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		printArray(47, (float)3.14, 11.11);
		printArray(47, 3.14F, 11.11);
		printArray("one", "two", "three");
		printArray("new A(), new A(), new A()");
		//(Object[])为了移除警告，不用添加也是对的
		//如果已经有了一个数组，该方法可以把它们当作可变参数列表来接受
//		printArray(new Integer[] {1, 2, 3, 4});
		printArray((Object[]) new Integer[] {1, 2, 3, 4});
//		将0个参数传递给可变参数列表是可行的；
		printArray();
	}

	
}/*Output:
47 3.14 11.11 
47 3.14 11.11 
one two three 
new A(), new A(), new A() 
1 2 3 4 
*///:WuRoc
