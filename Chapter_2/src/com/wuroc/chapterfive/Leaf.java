//: Leaf.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月9日
 *
 * 
 */
public class Leaf {
	
	int i = 0;
	
	Leaf increment() {
		
		i++;
		
		//由于increment()通过this关键字返回了对当前对象的引用
		return this;
		
	}
	void print() {
		
		System.out.println("i = " + i);
	}
	public static void main(String[] args) {
		
		Leaf x = new Leaf();
		//由于increment()通过this关键字返回了对当前对象的引用
		//所以很容易在一条语句里对同一对象执行多次操作。
		x.increment().increment().increment().print();
	}

}
