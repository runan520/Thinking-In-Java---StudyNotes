//Applicator1.java
package com.wuroc.chapternine;

/**
 * @author RocWu
 *
 */
public class Applicator1 {
	public static void apply(Processor1 p, Object s) {
		
		System.out.println("Using Processor " + p.name());
		
		System.out.println(p.process(s));
	}

}
