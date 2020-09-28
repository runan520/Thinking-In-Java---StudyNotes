package com.wuroc.chapternine;

import java.util.Arrays;

//Applicator.java

/**
 * @author RocWu
 *
 */
class Processor {
	public String name() {
		return getClass().getSimpleName();
		
	}
	
	public Object process(Object input) {
		return input;
	}
}

class Upcase extends Processor {
	//返回协变类型
	@Override
	public String process(Object input) {
		return ((String) input).toUpperCase();
	}
}
class Downcase extends Processor {
	@Override
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Splitter extends Processor {
	@Override
	public String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
}


public class Applicator {

	public static void apply(Processor p, Object s) {
		System.out.println("Using Processsor " +  p.name());
		System.out.println(p.process(s));
		
	}
	
	public static void main(String[] args) {
		String s = "We are such stuff as dreams are made on";
		apply(new Upcase(), s);
		apply(new Downcase(), s);
		apply(new Splitter(), s);
		
	}
}







