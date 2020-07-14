//: Overloading.java

package com.wuroc.chapterfive;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月9日
 *
 * 
 */

	class Tree{
		int height;
		Tree(){
			print("Planting a sending");
			height = 0;
		} 
		Tree(int initialHeight){
			height = initialHeight;
			print("Creating new Tree that is " + height + " feet tall ");
			
		}
		void info() {
			print("Tree is " + height + " feet tall ");
		}
		void info(String s) {
			print(s + ": Tree is " + height + " feet tall ");
		}
	}
	
	public class Overloading{
		public static void main(String[] args) {
			for(int i = 0; i < 5; i++) {
				//每循环一次，这里调用了构造器Tree()有参
				Tree t = new Tree(i);
				t.info();
				t.info("overloading method");
				
			}
			//这里调用默认构造器Tree()
			new Tree();
			
		}
	}









