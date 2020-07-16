//: Connection.java

package com.wuroc.chaptersix2;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月15日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class Connection {
	private static int counter = 0;
	private int id = counter++;
	Connection(){}
	public String toString() {
		return "Connection " + id;
	}
	public void doSomething() {}

}




