//: VarArgs.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月12日
 * import static com.wuroc.util.Print.*;
 * 
 */
class A{}
public class VarArgs {
	//java5 之前的版本这样用
	static void printArray(Object[] args) {
		for (Object obj: args) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printArray(new Object[] {47, (float)3.14, 11.11});
		printArray(new Object[] {"one", "two", "three"});
		printArray(new Object[] {new A(), new A(), new A()});
		
		
	}
}/*Output:
47 
3.14 
11.11 

one 
two 
three 

com.wuroc.chapterfive.A@15db9742 
com.wuroc.chapterfive.A@6d06d69c 
com.wuroc.chapterfive.A@7852e922 
*///:WuRoc
