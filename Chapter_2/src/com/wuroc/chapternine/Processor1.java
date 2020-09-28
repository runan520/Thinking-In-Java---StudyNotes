//Processor.java
package com.wuroc.chapternine;

import java.util.Arrays;

/**
 * @author RocWu
 *
 */
//当Processor1是一个接口的时候，可以复用Apply.process
public interface Processor1 {
	
	default String name() {
		return getClass().getSimpleName();		
	}
	
	Object process(Object input);

}











