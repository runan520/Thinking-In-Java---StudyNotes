//E02SimpleColection2.java
package com.wuroc.chaptereleven;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author RocWu
 *
 */
public class E02SimpleCollection2 {
	public static void main(String[] args) {
		//通常，Set不按插入顺序保存元素。
		Collection<Integer> c = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			c.add(i);	
		}
		for (Integer i : c) {
			
			System.out.print(i + ", ");
		}
	}

}
//0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 