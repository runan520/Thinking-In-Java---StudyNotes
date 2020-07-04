//: EqualsMethod2.java

package com.wuroc.chapterthree;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月1日
 *
 * 
 */
//包访问权限
class Value {

	int i;

}
public class EqualsMethod2 {

	public static void main(String[] args) {
	
		Value v1 = new Value();
		 
		Value v2 = new Value();
		
		v1.i = v2.i = 100;
		/*
		 * 这是由于equals()默认行为是比较引用。所以除非在自己的新类中覆盖equals()方法，否则不可能表现出我们希望的行为。 //
		 * 在上一个Integer包装类中里面实现了equals()的这个方法。
		 * 而这个类Value中没有实现equals()方法；
		 * 如果新类没有实现对equals的覆盖，所以就默认
		 */		
		System.out.println(v1.equals(v2));
	}
	
	
}/* Output：
false
*/// : ~
