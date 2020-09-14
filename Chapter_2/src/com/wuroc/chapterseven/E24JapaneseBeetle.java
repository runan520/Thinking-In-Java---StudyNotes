//: E24JapaneseBeetle.java

package com.wuroc.chapterseven;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月22日
 * 
 * 
 */
class JapaneseBeetle extends Beetle {
	int m = printInit("JapaneseBeetle.m initialized");
	JapaneseBeetle(){
		print("m = " + m);
		print("j = " + j);
	}
	static int x3 = printInit("static JapaneseBeetle.x3 initialized");
}
public class E24JapaneseBeetle {
	public static void main(String args[]) {
		new JapaneseBeetle();
	}

}
//加载类将初始化静态变量。基类首先加载，
//然后是下一个派生的类，最后是最派生的类。
//这将创建对象并初始化非静态成员，也从根类开始。
