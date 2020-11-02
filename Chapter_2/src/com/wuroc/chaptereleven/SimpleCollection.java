//SimpleCollection.java
package com.wuroc.chaptereleven;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author RocWu
 *
 */
public class SimpleCollection {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		for(int i = 0; i < 10; i++) 
			c.add(i);
			for(Integer i : c)
				System.out.print(i + ", ");
		
	}

}
//0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
