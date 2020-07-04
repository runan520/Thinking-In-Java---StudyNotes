//: E04Velocity.java

package com.wuroc.chapterthree;


/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 *
 * 
 */
public class E04Velocity {
	
	public static void main(String[] args) { 
		
//		if(args.length < 2) {
//			
//		System.err.println(
//				
//		"Usage: java E04_Velocity distance time");
//		
//		System.exit(1);
//		
//		}
		
		float distance = Float.parseFloat("60"); 
		
		float time = Float.parseFloat("6");
		
		System.out.print("Velocity = "); 
		
		System.out.print(distance / time);
		
		// Change the next line if you want to use a different
		// unit for 'distance' System.out.println(" m/s");
		}
		

}
