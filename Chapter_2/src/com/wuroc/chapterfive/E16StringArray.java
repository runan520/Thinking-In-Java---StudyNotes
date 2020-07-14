//: E16StringArray.java

package com.wuroc.chapterfive;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月12日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class E16StringArray {
	public static void main(String[] args) {
		String sal[] = new String[4];
		sal[0] = "These";
		sal[1] = "are";
		sal[2] = "some";
		sal[3] = "strings";
		for(int i = 0; i < sal.length; i++)
			System.out.println(sal[i]);
		String sa2[] = {"There", "are", "some", "strings"};
		for(int i = 0; i<sa2.length; i++)
			System.out.println(sa2[i]);
	}

}
/*output:
These
are
some
strings
There
are
some
strings
*///:
//*Assign a string to each element of an array of
//*String objects.Print the array using a for loop.
