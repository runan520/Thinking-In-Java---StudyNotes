//: E17RTTI.java

package com.wuroc.chaptereight;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年9月13日
 * import static com.wuroc.util.Print.*;
 * 
 */

public class E17RTTI {
	public static void main(String[] args) {
		Cycle[] cycles = new Cycle[] {
				new Unicycle(), 
				new Bicycle(),
				new Tricycle()
		};
		
		//Compile time: method not found in cycle:
		//cycle[0].balance();
		//cycle[1].balance();
		//cycle[2}.balance();
		
		((Unicycle)cycles[0]).balance();
		((Bicycle)cycles[1]).balance();
		//((Unicycle)cycles[2]).balance();  //Exception thrown
	}

}
