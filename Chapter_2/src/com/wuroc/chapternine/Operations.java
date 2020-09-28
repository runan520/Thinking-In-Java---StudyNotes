//Operations.java
package com.wuroc.chapternine;

/**
 * @author RocWu
 *
 */
public interface Operations {
	void execute();
	//可变参数列表
	static void runOps(Operations... ops) {
		for (Operations op: ops) {
			op.execute();
		}		
	}
	
	static void show(String msg) {
		System.out.println(msg);
	}
	
}


//java8允许接口中添加静态方法




