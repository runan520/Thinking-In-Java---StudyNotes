//: Orc.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月22日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Villain{
	private String name;
	protected void set(String nm) {
		name = nm;
	}
	public Villain(String name) {
		this.name = name;
	}
	
	public String toString() {		
		return "I`m a Villain and my name is " + name;
	}
	
}
public class Orc extends Villain {
	private int orcNumber;
	/**
	 * @param name
	 * @param orcNumber 
	 */
	public Orc(String name,  int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
		// TODO Auto-generated constructor stub
	}
	
	public void change(String name, int orcNumber) {
		set(name);  //protected 是可用的
		this.orcNumber = orcNumber;
	}
	//重写；依据基类版本定义的
	@Override
	public String toString() {
		//调用才会打印出name。不调用不会，就与上面的类没关系了
		return "Orc " + orcNumber + ": " + super.toString();
	}
	public static void main(String[] args) {
		Orc orc = new Orc("Limburger", 12);
		System.out.println(orc);
		orc.change("WuRoc", 19);
		System.out.println(orc);
	}
	
	

}
