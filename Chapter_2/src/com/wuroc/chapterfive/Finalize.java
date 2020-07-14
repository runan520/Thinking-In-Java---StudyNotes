//: Finalize.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月10日
 *
 * 
 */
class Book2{
public int id;
public Book2(int i){
	id=i;
}
protected void finalize(){
	switch(id){
		case 1:
			System.out.print("《Thinking in java》");
		break;
		case 2:
			System.out.print("《Java语言程序设计》");
		break;
		case 3:
			System.out.print("《红宝书》");
		break;
		default:
			System.out.print("《数据结构与算法》");
			break;
	}
		System.out.println(" 所对应的实例对象存储单元被回收");
	}
}


public class Finalize{
	public static void main(String args[]){
		Book2 book=new Book2(1);
		new Book2(3);
		System.gc();
	}
}
