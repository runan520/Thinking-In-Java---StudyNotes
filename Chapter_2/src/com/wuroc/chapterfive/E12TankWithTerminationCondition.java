//: E12TankWithTerminationCondition.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月12日
 *
 * 
 */
class Tank{
	static int counter;
	int id = counter++;
	boolean full;
	public Tank() {
		System.out.println("Tank " + id + " created");
		full = true;
	}
	public void empty() {
		full = false;
		
	}
	protected void finalize() {
		if(full)
			System.out.println("Error:tank " + id + " must be empty at cleanup");
		else
			System.out.println("Tank " + id + " cleaned up Ok");
	}
//	public String toString() {
//		return "Tank " + id;
//	}
}
public class E12TankWithTerminationCondition {
	public static void main(String[] args) {
		new Tank().empty();
		new Tank();
		//Don`t empty the second one 
		//调用 gc 方法暗示着 Java 虚拟机做了一些努力来回收未用对象，以便能够快速地重用这些对象当前占用的内存。
		//当控制权从方法调用中返回时，虚拟机已经尽最大努力从所有丢弃的对象中回收了空间。
		System.gc(); //Force Finalization？
		//运行处于挂起终止状态的所有对象的终止方法。 
		System.runFinalization();
	}

}
