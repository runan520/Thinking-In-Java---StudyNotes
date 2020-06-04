//: P10ShowArgs.java

package com.wuroc.chaptertwo;

/**
 * @author HepengWu
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年6月3日
 *
 * 
 */
public class P10ShowArgs {
	
	
	
	public static void main(String[] args) {
		
		String [] name = {"John Doe","Mary Jane","Peter Pan"};
		
//		如果参数小于4 直接跳过 
		if(name.length <4) {
			
			System.err.println("Need 3 arguments ");
			
			System.exit(1);
			
					
			} 
		
		
		for(int i=0;i<name.length;i++) {
			
		System.out.println(name[i]);
			
		} 
	}

}
	
	


