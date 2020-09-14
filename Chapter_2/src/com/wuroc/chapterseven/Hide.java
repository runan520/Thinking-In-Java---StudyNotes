//: Hide.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月21日
 * 
 * 
 */
class Homer{
	char doh(char c) { 
		System.out.println("doh(char)");
		return 'd';
	}

	float doh(float f) {
		System.out.println("doh(float)");
		return 1.0f;
	}
}

class Milhouse{}

class Bart extends Homer {
	void doh(Milhouse m) {
		System.out.println("doh(Milhouse)");
	}
}
public class Hide{
	public static void main(String[] args) {
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		System.out.println(b.doh(1.0f));
		b.doh(new Milhouse());
	}
}
/*Output:
doh(float)
doh(char)
doh(float)
doh(float)
1.0
doh(Milhouse)
*///