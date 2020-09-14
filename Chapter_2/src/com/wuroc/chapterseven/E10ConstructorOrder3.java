//: E10ConstructorOrder3.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月17日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Component1b{
	
	public Component1b(int i) {
		
		System.out.println("Component1b " + i);
		
	}
}
class Component2b{
	
	public Component2b(int i) {
		
		System.out.println("Component2b " + i);
		
	}
}
class Component3b{
	
	public Component3b(int i) {
		
		System.out.println("Component3b " + i);
		
	}
	
}
class Rootb{
	
	public Rootb(int i) {
		
		System.out.println("Rootb");
		
	}
	//这三个先调用
	Component1b c1 = new Component1b(1);
	
	Component2b c2 = new Component2b(2);
	
	Component3b c3 = new Component3b(3);
}
	class Stemb extends Rootb{
		/**
		 * @param i
		 */
		public Stemb(int i) {
			
			super(i);
			
			System.out.println("Stemb");
		}
		Component1b c1 = new Component1b(4);
		
		Component2b c2 = new Component2b(5);
		
		Component3b c3 = new Component3b(6);
				
	}

public class E10ConstructorOrder3 {
	
	public static void main(String[] args) {
		
		new Stemb(47);
		
	}

}
/*Output:
Component1b 1
Component2b 2
Component3b 3
Rootb
Component1b 4
Component2b 5
Component3b 6
Stemb
 * 
 * 我们显示“组件”参数以阐明构造函数调用的顺序。
 */

