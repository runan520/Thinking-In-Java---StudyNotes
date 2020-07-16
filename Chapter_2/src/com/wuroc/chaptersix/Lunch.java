//: Lunch.java

package com.wuroc.chaptersix;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月15日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Soup1 {
	private Soup1() {}
	public static Soup1 makeSoup() {
		return new Soup1();
		
	}
	
}
class Soup2{
	private Soup2() {}
	//静态static，Soup2类的对象，有且只有一个。
	private static Soup2 ps1 = new Soup2();
	
	public static Soup2 access() {
		return ps1;
	}
	
	public void f() {}
	
}

public class Lunch {
	void testPrivate() {
		//because Private constructor
//!	Soup1 soup1 = new Soup1();	
		
	}
	void testStatic() {                            
		Soup1 soup = Soup1.makeSoup();
	}
	void testSingleton() {
		Soup2.access().f();
	}
	
	
}
