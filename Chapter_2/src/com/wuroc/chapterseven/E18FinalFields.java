//: E18FinalFields.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月22日
 * import static com.wuroc.util.Print.*;
 * 
 */
class SelfCounter{
	private static int count;
	private int id = count++;
	@Override
	public String toString() {
		return "SelfCounter" + id;
	}
}
class WithFinalFields{
	final SelfCounter scf = new SelfCounter();
	//一个即是static 又是 final 的域只占据一段不能改变的储存空间
	static final SelfCounter scsf = new SelfCounter();
	@Override
	public String toString(){
		return "scf = " + scf + "\nscsf = " + scsf;
	}
}
public class E18FinalFields {
	public static void main(String args[]) {
		System.out.println("First objecct:");
		System.out.println(new WithFinalFields());
		System.out.println("Second object:");
		System.out.println(new WithFinalFields());
	}
	
}
/*
 * First objecct: 
 * scf = SelfCounter1
 * scsf = SelfCounter0 
 * Second object:
 * scf =SelfCounter2 
 * scsf = SelfCounter0
 */
//由于类加载会初始化静态final，
//因此在WithFinalFields的两个实例中它都具有相同的值，
//而常规final的值对于每个实例都不同。
