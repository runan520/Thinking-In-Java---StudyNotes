//: E14StaticStringInitialization.java

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
public class E14StaticStringInitialization {
	static String s1 = "Initialized at definition";
	static String s2;
	//静态初始化只在Class对象首次加载的时候进行一次
	static {
		s2 = "Initialized in static block";
	}
	public static void main(String[] args) {
		print("s1 = " + s1);
		print("s2 = " + s2);
	}
}
/*Output:
s1 = Initialized at definition
s2 = Initialized in static block
*///WuRoc