//: FinalArguments.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月22日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Gizmo{
	public void spin() {
		
	}
}
public class FinalArguments {
	
	void with(final Gizmo g) {
//		The final local variable g cannot be assigned. 
//		It must be blank and not using a compound assignment
	
//		g = new Gizmo();
	}
	void without(Gizmo g) {
		g = new Gizmo();
		g.spin();
	}
	void f (final int i) {
//		i++;
	}
	int g(final int i) {
		return i + 1;
	}
	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.without(null); 
		bf.with(null);
	}
}




