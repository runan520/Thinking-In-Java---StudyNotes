//: P02_HelloWord.java

package com.wuroc.chaptertwo;

/**
 * @author HepengWu
 * @author www.github.com/WuRoc
 * @version 1.0
 * @2020年6月3日
 *
 * 
 */
public class P02_HelloWord {
//	public 关键字意指这是一个可由外部调用的方法。
//	main（）方法的参数是一个String对象的数组。
//	在这个程序中并未用到args ，但是Java编译器要求必须这样做，
//	因为args 要用来储存命令行参数
	public static void main(String[] args) {
		System.out.println("Hello,Word !");
	}

} /*output:
Hello,Word!
 *///:~
/****************** Exercise 1 ******************
 * Following the HelloDate.java example in this
 * chapter, create a "hello, world" program that
 * simply prints out that statement. You need
 * only a single method in your class (the "main"
 * one that gets executed when the program
 * starts). Remember to make it static and to
 * include the argument list, even though you
 * don't use the argument list. Compile the
 * program with javac and run it using java. If
 * you are using a different development
 * environment than the JDK, learn how to compile
 * and run programs in that environment.
***********************************************/
