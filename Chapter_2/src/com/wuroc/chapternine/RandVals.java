//RandVals.java
package com.wuroc.chapternine;

import java.util.Random;

/**
 * @author RocWu
 *
 */
public interface RandVals {
	//既然是域static的。它们就可以在类的第一次加载时初始化，这发生在任何首次被访问时。
	Random RAND = new Random(47);
	int RANDOM_INT = RAND.nextInt(10);
	long RANDOM_LONG = RAND.nextLong() * 10;
	float RANDOM_FLOAT = RAND.nextFloat() * 10;
	double RANDOM_DOUBLE = RAND.nextDouble() * 10;

	public static void main(String[] args) {
		System.out.println(RandVals.RANDOM_INT);
		System.out.println(RandVals.RANDOM_LONG);
		System.out.println(RandVals.RANDOM_FLOAT);
		System.out.println(RandVals.RANDOM_DOUBLE);
	}


}
