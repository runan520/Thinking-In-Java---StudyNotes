//: Passobject.java

package com.wuroc.chapterthree;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月1日
 *
 * 
 */
class Letter{
	
	char c;
	
}
public class Passobject {
	static void f(Letter y) {
//		实际上是改变的f()的对象
		y.c = 'z';
	}
	public  static void main(String[] args) {
		
		Letter x = new Letter();
		
		x.c = 'a';
		
		print("1: x.c: " + x.c);
		
		f(x);
		
		print("2: x.c: " + x.c);
		
	}
	
	
	
	

}/* Output:
1: x.c: a
2: x.c: z
*///:~
