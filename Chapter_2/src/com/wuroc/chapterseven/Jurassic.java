//: Jurassic.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月22日
 * import static com.wuroc.util.Print.*;
 * 
 */
class SmallBrain{
	
}
final class Dinosaur{
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f() {}
}
//class Futher extends Dinosaur {}
public class Jurassic {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 48;
		n.j++;
		System.out.println(n.j++);
	}
}
