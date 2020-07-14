//: E10FinalizeCall.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月12日
 *
 * 
 */
public class E10FinalizeCall {
	protected void finalize() {
		System.out.println("finalize() called");
	}
public static void main(String args) {
	new E10FinalizeCall();
}
}

/*
 * You probably won't see the finalizer called 
 * because the program doesn't
 * usually generate enough garbage for the collector to run.
 */





