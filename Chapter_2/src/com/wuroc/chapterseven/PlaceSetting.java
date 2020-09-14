//: PlaceSetting.java

package com.wuroc.chapterseven;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月20日
 * 
 * 
 */
class Plate{
	Plate(int i){
		print("Plate construtor");
	}
}
class DinnerPlate extends Plate{
	DinnerPlate(int i){
		super(i);
		print("DinnerPlate constructor");
	}
		
}
class Utensil{
	Utensil(int i){
		print("Utensil contructor");
	}
}
class Spoon extends Utensil{

	/**
	 * @param i
	 */
	Spoon(int i) {
		super(i);
		print("Spoon construtor");
		
	}
	
}
class Fork extends Utensil{
	Fork(int i){
		super(i);
		print("Fork constructor");
	}
}
class Knife extends Utensil {
	Knife(int i){
		super(i);
		print("Knife constructor");
	}
}
class Custom {
	Custom(int i) {
		print("Custom constructor");
	}
}
public class PlaceSetting extends Custom {
	//并不监督你必须将成员对象也初始化
	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;
	
	/**
	 * @param i
	 */
	PlaceSetting(int i) {
		super(i + 1);
		sp = new Spoon(i + 2);
		frk = new Fork(i + 3);
		kn = new Knife(i + 4);
		pl = new DinnerPlate(i + 5);
		print("PlaceSeting constructor");
		
	}
	public static void main(String[] args) {
		PlaceSetting x = new PlaceSetting(9);
	}

}
