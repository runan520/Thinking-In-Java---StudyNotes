//: Transmogrify.java

package com.wuroc.chaptereight;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年9月13日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Actor {
	public void act() {
		
	}
}

class HappyActor extends Actor {
	@Override
	public void act() {
		print("HappyActor");
	}
}
class SadActor extends Actor {
	@Override
	public void act() {
		print("SadActor");
	}
}

class Stage {
	private Actor actor = new HappyActor();
	public void change() {
		actor = new SadActor();
	}
	public void performPlay() {
		actor.act();
	}
}

public class Transmogrify {
	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();  //状态模式
		stage.performPlay();
	}

}

/*
 * 通过继承得到两个不同的类， 用于表达act（）方法的差异， 
 * 而Stage通过运用组合使自己的状态发生变化。 
 * 这种状态的改变也就产生了行为的改变。
 */




