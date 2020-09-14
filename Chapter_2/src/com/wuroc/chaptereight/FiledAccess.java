//: FiledAccess.java

package com.wuroc.chaptereight;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年8月20日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Super{
	public int field = 0;
	public int getField() {
		return field;
	}
}
class Sub extends Super{
	public int field = 1;
	
	@Override
	public int getField() {
		return field;
	}
	
	public int getSuperField() {
		return super.field;
	}
}
public class FiledAccess {
	public static void main(String[] args) {
		Super sup = new Sub();    //Upcast
		System.out.println("Sup.field = " + sup.field + ", sup.getField() = " + sup.getField());
		Sub sub = new Sub();
		System.out.println("sub.field = " + sub.field + ", sup.getField() = " + sup.getField() + ", sub.getSuperField() = " + sub.getSuperField());
	}

}













