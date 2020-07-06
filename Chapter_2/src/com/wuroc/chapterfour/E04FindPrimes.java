//: E04FindPrimes.java

package com.wuroc.chapterfour;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月5日
 *
 * 
 */
public class E04FindPrimes {
	
	public static void main(String[] args) {
		int max = 100;
		// Get he max value from the command and line, 
		// if the argument has be n provide :
//		if (args.length != 0)
//			
//			max = Integer.parseInt(args[0]);
		
		for (int i = 1; i < max; i++) {
			
			boolean prime = true;
		
			for(int j = 2; j < i; j++)
				if(i % j == 0)
					prime = false;
			
			if (prime)
				System.out.println(i + " ");
			
		}


		
	}
	

}
