//: Rock.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月7日
 *
 * 
 */
class Rock {
	Rock(){
		System.out.print("Rock ");
		
	}

}
public class SimpleConstructor {
	public static void main(String[] args) {
		for(int i = 0;i < 10; i++)
			new Rock();
	}
}
/*Output
 *Rock Rock Rock Rock Rock Rock Rock Rock Rock Rock 
 *///
