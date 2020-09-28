package com.wuroc.chapternine;

interface Bob1 {
	default void bob() {
		System.out.println("Bob1 ::bob");
	}
}

interface Bob2{
	default void bob() {
		System.out.println("Bob2::bob");
	}
}
//从类型继承了名称为bob且参数为()和()的重复默认方法
//class Bob implements Bob1, Bob2 {}
// 1 error
interface Sam1 {
	default void sam() {
		System.out.println("Sam1::sam");
	}
}

interface Sam2 {
	default void sam(int i) {
		System.out.println(i * 2);
	}
}

//This works because the argument lists are distinct:
class Sam implements Sam1, Sam2{}

interface Max1 {
	default void max() {
		System.out.println("Max1::max");
	}
}

interface Max2 {
	default int max() {
		return 47;
	}
}
//从类型继承了名称为max且参数为()和()的重复默认方法Max2和Max1l
//class Max implements Max1, Max2 {}





