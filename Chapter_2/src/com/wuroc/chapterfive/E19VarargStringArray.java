//: E19VarargStringArray.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月14日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class E19VarargStringArray {
	static void printStrings(String... strs) {
		for(String s : strs)
			System.out.println(s);
		
	}
	public static void main(String args[]) {
		printStrings("There", "are", "some", "string");
		printStrings(new String[] {"There", "are", "some", "string"});
	}

}
