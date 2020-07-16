//: E05Other.java

package com.wuroc.chaptersix2;

import com.wuroc.chaptersix.E05AccessControl;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月15日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class E05Other {
	public E05Other() {
		E05AccessControl test = new E05AccessControl();
		test.a = 1;
//		test.b = 2;   private
//		test.c = 3;   protected
//		test.d = 4;   package
		test.f1();
//		test.f2(); 私有
//		test.f3(); protected
//		test.f4(); package
	}

}
