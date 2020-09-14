//: E16Frog.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月22日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Amphibian{
	public void moveInWater() {
		System.out.println("Move iv Water");
	}
	public void moveOnLand() {
		System.out.println("Move On Land");
	}
}
class Frog extends Amphibian{}
public class E16Frog {
	public static void main(String args[]) {
		//向上转型
		Amphibian a = new Frog();
		a.moveInWater();
		a.moveOnLand();
	}

}
