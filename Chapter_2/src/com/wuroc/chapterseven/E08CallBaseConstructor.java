//: E08CallBaseConstructor.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月17日
 * import static com.wuroc.util.Print.*;
 * 
 */
class BaseNonDefault {
	public BaseNonDefault(int i) {
		System.out.println(i);
	}
}
class DerivedTwoConstructors extends BaseNonDefault{

	/**
	 * @param i
	 */
	public DerivedTwoConstructors() {
		super(47);
		// TODO Auto-generated constructor stub
	}
	public DerivedTwoConstructors(int i) {
		super(i);
	}
	
}
public class E08CallBaseConstructor {
	public static void main(String args[]) {
		new DerivedTwoConstructors();
		new DerivedTwoConstructors(74);
	}

}
/*Output:
47
74
*///