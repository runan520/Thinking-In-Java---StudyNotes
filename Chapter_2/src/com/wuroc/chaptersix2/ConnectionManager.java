//: ConnectionManager.java

package com.wuroc.chaptersix2;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月15日
 * import static com.wuroc.util.Print.*;
 * 
 */

public class ConnectionManager {
	
	private static Connection[] pool = new Connection[10];
	private static int counter = 0;
	static {
		for(int i = 0; i < pool.length; i++)
			pool[i] = new Connection();
	}
	public static Connection getConnection() {
		if (counter < pool.length)
			return pool[counter++];
		return null;
	}
}
