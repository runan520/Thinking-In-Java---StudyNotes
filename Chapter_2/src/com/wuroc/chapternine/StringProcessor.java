//StringProcessor.java
package com.wuroc.chapternine;

import java.util.Arrays;

/**
 * @author RocWu
 *
 */
public interface StringProcessor extends Processor1 {
	//该声明不是必要的，即使移除它，编译器也不会报错
	//但是注意这里的协变返回类型变成String
	@Override
	String process(Object input);
	//S自动就是final和static的，因为它是在接口中定义的
	String S = "If she weights the same as a duck, she is made of wood";
	//可以在接口中定义main（）方法
	public static void main(String[] args) {
		Applicator1.apply(new Upcase1(), S);
		Applicator1.apply(new Downcase1(), S);
		Applicator1.apply(new Splitter1(), S);
	}
}

class Upcase1 implements StringProcessor {
	//返回协变类型
	@Override
	public String process(Object input) {
		return ((String) input).toUpperCase();
	}
}

class Downcase1 implements StringProcessor {
	@Override
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Splitter1 implements StringProcessor {
	@Override
	public String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
}

