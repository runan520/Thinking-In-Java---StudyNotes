//E20InterfaceWithNested.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
interface WithNested{
	class Nested{
		int i;
		public Nested(int i) {
			this.i = i;
		}
		void f() {
			System.out.println("Nested.f");
		}
	}
}
	class B2 implements WithNested{}
public class E20InterfaceWithNested {
	public static void main(String[] args) {
		B2 b = new B2();
		WithNested.Nested ne = new WithNested.Nested(5);
		ne.f();
	}
}
/*
 * 即使接口本身没有用，在接口中定义的嵌套类仍然有用。
 * 如果我们在WithNested中定义嵌套，则意味着我们将其
 * 名称放置在此处，因为接口的所有元素都是公共的。 
 * 嵌套没有添加对WithNested元素的访问。
 */

