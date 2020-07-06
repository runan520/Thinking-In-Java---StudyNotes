//: E02RandmInts.java

package com.wuroc.chapterfour;

import java.util.Random;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月5日
 *
 * 
 */
public class E02RandomInts {
	/*
	 * 使用单个 long 种子创建一个新的随机数生成器。 该种子是伪随机数生成器的内部状态的初始值， 该生成器可通过方法 next(int) 维护。 调用
	 * new Random(seed) 等效于：
	 *
	 * Random rnd = new Random(); rnd.setSeed(seed);
	 */

	static Random r = new Random(47);

	public static void compareRand() {
//		nextInt(int n) 
/*      返回一个伪随机数，它是取自此随机数生成器序列的、
		在 0（包括）和指定值（不包括）
		之间均匀分布的 int 值。*/
		int a = r.nextInt();

		int b = r.nextInt();

		System.out.println("a= " + a + ", b = " + b);

		if (a < b)

			System.out.println("a < b");

		else if (a > b)

			System.out.println("a > b");

		else

			System.out.println("a = b");

	}

	public static void main(String[] args) {

		for (int i = 0; i < 25; i++)

			compareRand();

	}

}
