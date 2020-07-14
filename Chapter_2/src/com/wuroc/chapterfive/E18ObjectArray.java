//: E18ObjectArray.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月12日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class E18ObjectArray {
	public static void main(String[] args) {
	
		Test[] array = new Test[5];
		for(int i = 0; i < array.length; i++)
			array[i] = new Test(Integer.toString(i));
		
	
}
}/*Output
String constructor; s =0
String constructor; s =1
String constructor; s =2
String constructor; s =3
String constructor; s =4
*///:WuRoc
