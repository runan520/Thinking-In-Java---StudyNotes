//: BlankFinal.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月22日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Poppet {
	private int i;
	Poppet(int ii){
		i = ii;
		
		System.out.println(i);
	}
}
public class BlankFinal {
	private final int i = 0;
	private final int j;
	private final   Poppet p;
	
	public BlankFinal() {
		j = 1;
//		里面的1 是传给构造器的i
		p = new Poppet(1); 
		System.out.println(p);
	}
	public BlankFinal(int x) {
		j = x;
		p = new Poppet(x);
		//这里打印的是引用
		
		
	}
	@Override
	public String toString() {
		return "x " + p;
		
	}
	public static void main(String args[]) {
		new BlankFinal();
		new BlankFinal(47);
		
		
	}
}
