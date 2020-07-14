//: ExplicitStatic.java

package com.wuroc.chapterfive;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月12日
 *
 * 
 */
class Cup{
	Cup(int marker){
		print("Cup(" + marker +")");
	}
	void f(int marker) {
		print("f(" + marker + ")");
		
	}
}
class Cups{
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups(){
		print("Cup()");
	}
	
}
public class ExplicitStatic{
	public static void main(String[] args) {
		print("Inside main()");
//		Cups.cup1.f(99);
		
		
	}
	static Cups cup1 = new Cups();
//	static Cups cup2 = new Cups();
}

