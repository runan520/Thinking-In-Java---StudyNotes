////: E20OverrideAnnotation.java
//
//package com.wuroc.chapterseven;
//import static com.wuroc.util.Print.*;
///**
// * @author WuRoc
// * @GitHub www.github.com/WuRoc
// * @version 1.0
// * @2020年7月22日
// * 
// * 
// */
//class OverridingPrivateE20 extends WithFinals{
//	//如果重写错误直接报错
//	@Override
//	private final void f() {
//		print("WithFinals.f()");
//	}
//	@Override
//	private final void g() {
//		print("OverridingPrivateE20.g()");
//	}
//}
//class OverridingPrivate2E20 extends OverridingPrivateE20{
//	@Override
//	public final void f() {
//		print("OverridingPrivate2E20.f()");
//	}
//	@Override
//	public final void g() {
//		print("OverridingPrivate2E20.g()");
//	}
//}
//public class E20OverrideAnnotation {
//
//	public static void main(String[] args) {
//		OverridingPrivate2E20 op2 = new OverridingPrivate2E20();
//		op2.f();
//		op2.g();
//	}
//}
