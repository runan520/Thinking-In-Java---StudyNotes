//: E19BlankFinalField.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月22日
 * import static com.wuroc.util.Print.*;
 * 
 */
class WithBlankFinalField {
	//Without this constructor,you'll get a compiler error:
	//"variable i might not have been initialized"
	private final Integer i;
	public WithBlankFinalField(int ii) {
		i =new Integer(ii);
	}
	
	public Integer geti() {
		//This won't compile. The error is:
		//"cannot assign a value to final variablei"
		//if(i==null)
		//i=new Integer(47);
		return i;
		
	}
}
public class E19BlankFinalField {
	public static void main(String args[]) {
		WithBlankFinalField wbff = new WithBlankFinalField(10);
		System.out.println(wbff.geti());
		}

}
