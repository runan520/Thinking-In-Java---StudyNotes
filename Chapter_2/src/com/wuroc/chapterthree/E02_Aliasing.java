//: E02_Aliasing.java

package com.wuroc.chapterthree;

import static com.wuroc.util.Print.*;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年6月30日
 *
 * 
 */
class Integral {

	float f;
}

public class E02_Aliasing {

	public static void main(String[] args) {

		Integral n1 = new Integral();

		Integral n2 = new Integral();

		n1.f = 8f;

		n2.f = 66f;

		print("1: n1.f: " + n1.f + ", n2.f: " + n2.f);

		n1.f = n2.f;

		print("2: n1.f: " + n1.f + ", n2.f: " + n2.f);

		n1.f = 27f;

		print("3: n1.f: " + n1.f + ", n2.f: " + n2.f);
		/* n1=n2
		 * 别名的现象，相同的引用，他们指向相同的对象。
		 * （原本t1包含的对对象的引用，是指向一个值为8的对象，在对t1赋值的时候，这个引用被覆盖，也就是丢失了，而那个不再被引用的对象会由垃圾回收器自动清理）
		 */
		n1 = n2;

		print("4: n1.f: " + n1.f + ", n2.f: " + n2.f);

		n1.f = 27f;

		print("5: n1.f: " + n1.f + ", n2.f: " + n2.f);
	}
} /* Output:
1: n1.f: 8.0, n2.f: 66.0
2: n1.f: 66.0, n2.f: 66.0
3: n1.f: 27.0, n2.f: 66.0
4: n1.f: 66.0, n2.f: 66.0
5: n1.f: 27.0, n2.f: 27.0
*///:~

