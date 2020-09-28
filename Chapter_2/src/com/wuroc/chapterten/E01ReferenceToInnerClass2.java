//E01ReferenceToInnerClass.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
class Outer2{
	private final String data;
	Outer2(String data){
		this.data = data;
	}
	class Inner{
		public String toString(){
			return data;
		}	
		}
	
	
	Inner getInner() {
		return new Inner();
	}
}

public class E01ReferenceToInnerClass2 {
	public static void main(String[] args) {
		Outer2 o = new Outer2("Inner accessing outer!");
		//这里创建并初始化指向某个Inner对象的引用
		Outer2.Inner i = o.getInner();
		System.out.println(i.toString());
	}

}
