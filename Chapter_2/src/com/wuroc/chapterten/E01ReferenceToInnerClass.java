//E01ReferenceToInnerClass.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
class Outer{
	class Inner{
		{
			System.out.println("Inner created");
		}
		
		}
	Inner getInner() {
		return new Inner();
	}
}

public class E01ReferenceToInnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		//这里创建并初始化指向某个Inner对象的引用
		Outer.Inner i = o.getInner();
	}

}
