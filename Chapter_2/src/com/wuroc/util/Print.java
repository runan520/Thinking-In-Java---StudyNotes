//: Print.java

package com.wuroc.util;

import java.io.PrintStream;

/**
 * @author HepengWu
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年6月29日
 *
 * 
 */
public class Print {
	
	//Print with a newline
	//对象使用换行符打印
	public static void print(Object obj) {
		System.out.println(obj);
		
	}
	//Print a newline by itself
	//光打印换行符
	public static void print() {
		System.out.println();
	}
	
	//打印时没有换行符
	//Print with no line break
	
	public static void printnb(Object obj) {
		
		System.out.print(obj);
		
	}
	
	/*
	 * The new Java SE5 printf() (from C)
	 *  printf(Locale l, String format, Object...args) 
	 *  使用指定格式字符串和参数将格式化的字符串写入此输出流的便捷方法
	 */
	public static PrintStream printf(String format,Object...args ) {
		 return System.out.printf(format,args);
	}
}
