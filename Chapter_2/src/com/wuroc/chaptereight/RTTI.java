//: RTTI.java

package com.wuroc.chaptereight;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年9月13日
 * import static com.wuroc.util.Print.*;
 * 
 */

class Useful {
	public void f() {};
	public void g() {};
}

class MoreUseful extends Useful {
	public void f() {};
	public void g() {};
	public void u() {};
	public void v() {};
	public void w() {};
}

public class RTTI {
	public static void main(String args[]) {
		Useful[] x = {
				new Useful(),
				new MoreUseful()
		};
		x[0].f();
		x[1].g();
		//Compile time: method not found in Useful;
		//x[1].u();
		((MoreUseful)x[1]).u();   
//		((MoreUseful)x[0]).u();
	}	
}




