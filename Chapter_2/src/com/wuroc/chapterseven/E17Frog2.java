//: E17Frog2.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月22日
 * import static com.wuroc.util.Print.*;
 * 
 */

class Frog2 extends Amphibian{
	@Override
	public void moveInWater() {
		System.out.println("Frog swimming");
	}
	@Override
	public void moveOnLand() {
		super.moveOnLand();
		System.out.println("Frog jumping");
	}
}
public class E17Frog2 {
	public static void main(String[] args) {
//		由于编译器引用了两栖动物，因此您可能会猜测它将调用两栖动物方法。而是，它调用Froge方法。由于a确实是对FRoG2的引用，因此这是适当的结果。这就是多态性：
//		即使您在与基类引用进行交谈，也会发生正确的行为。
	//如果是没有承诺更新
		Amphibian a = new Frog2();
	a.moveInWater();
	a.moveOnLand();
}
}
/*Output
Frog swimming
Move On Land
Frog jumping
*///
