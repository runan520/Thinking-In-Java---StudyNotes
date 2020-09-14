////: PrivateOverride.java
//
//package com.wuroc.chaptereight;
//
///**
// * @author WuRoc
// * @GitHub www.github.com/WuRoc
// * @version 1.0
// * @2020年8月20日
// * import static com.wuroc.util.Print.*;
// * 
// */
//public class PrivateOverride {
//	//private结论是只有非private方法才能被重写，但是得小心重写private方法的现象，编译器不报错，但不会按我们所预期的执行。
//	private void f() {
//		System.out.println("private f()");
//	}
//	
//	public static void main(String[] args) {
//		
//		PrivateOverride po = new Derived();
//		po.f();
//	}
//
//}
//class Derived extends PrivateOverride {
//	public void f() {
//		System.out.println("public f()");
//	}
//	
//}
