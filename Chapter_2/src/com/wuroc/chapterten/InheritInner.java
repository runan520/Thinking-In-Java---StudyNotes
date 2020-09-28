//inheritInner.java
package com.wuroc.chapterten;

import com.wuroc.chapterten.WithInner.Inner;

/**
 * @author RocWu
 *
 *
 */
class WithInner {
	class Inner{}
}
public class InheritInner extends WithInner.Inner {
	InheritInner(WithInner wi){
		//而且不能只是传递一个指向外围类对象的引用。
		//此外，必须在构造器内使用如下语法：
		wi.super();
	}
	
	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
	}
}
