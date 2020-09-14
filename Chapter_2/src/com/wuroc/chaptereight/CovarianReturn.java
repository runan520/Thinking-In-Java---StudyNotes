//: CovarianReturn.java

package com.wuroc.chaptereight;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年9月13日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Grain {
	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain{
	public String toString() {
		return "Wheat";
		
	}
}

class Mill {
	
	Grain process() {
		return new Grain();
	}
	
}

class WheatMill extends Mill {
	@Override
	Wheat process() {    //JavaSE5之前的版本将强制process（）的覆盖版本必须返回Grain(),而不能返回Wheat,
		//尽管Wheat是从Grain导出的，因而也应该是一种合法的返回类型。协变返回类型允许返回更具体的Wheat类型
		return new Wheat();
	}
}

public class CovarianReturn {
	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		System.out.println(g);
		m = new WheatMill();
		g = m.process();
		System.out.println(g);
		
	}

}

//协变返回类型，它表示在导出类中的覆盖方法
//可以返回基类方法的返回类型的某种导出类性
/* Output:
Grain
Wheat
*/





