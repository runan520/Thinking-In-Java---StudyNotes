//: E08ConnectionManager.java

package com.wuroc.chaptersix2;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月15日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class E08ConnectionManager {
	public static void main(String args[]) {
		Connection c = ConnectionManager.getConnection();
		//for循环对应while循环
		while (c != null) {
			System.out.println(c);
			c.doSomething();
			c = ConnectionManager.getConnection();
		}
	}

}
