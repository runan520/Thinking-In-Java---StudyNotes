//: OrderOfInitialization.java

package com.wuroc.chapterfive;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月12日
 *
 * 
 */
class Window{
	Window(int marker){
		print("Window(" + marker + ")");
		
	}
}
class House {
		Window w1 = new Window(1);
		House(){
			//show that we`re in the constructor;
			print("House");
			//再次被构造化
			w3 = new Window(33);	
			
		}
		
		Window w2 = new Window(2);
		void f() {
			print("f()");
		}
		Window w3 = new Window(3);   //At end
		}
		
	

public class OrderOfInitialization {
	public static void main(String[] args) {
		House h = new House();
		h.f();
	}
	
}






