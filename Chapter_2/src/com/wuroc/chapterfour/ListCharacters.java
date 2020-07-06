//: ListCharacters.java

package com.wuroc.chapterfour;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月5日
 *
 * 
 */
public class ListCharacters {
	
	public static void main(String[] args) {
		for(char c = 0; c < 128; c++)
			
			if(Character.isUpperCase(c))
				System.out.println("value: " + (int)c + " Character: " + c);
	}
	
	
	

}
