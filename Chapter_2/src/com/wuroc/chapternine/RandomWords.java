//RandomWords.java
package com.wuroc.chapternine;


import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @author RocWu
 *
 */

public class RandomWords implements Readable {
	
	private static Random rand = new Random(47);
	private static final char[] capitals = "ABCD".toCharArray();
	private static final char[] lowers = "abcd".toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	private static final char[] vowel = "1234".toCharArray();
	private int count;
	public RandomWords(int count) {  //下面是10
		this.count = count;
	}
	
	@Override
	public int read(CharBuffer cb){
		
		if (count-- == 0)
			return -1;
		
		cb.append(capitals[rand.nextInt(capitals.length)]);
		
		for(int i = 0;i < 4; i++) {
		cb.append(vowels[rand.nextInt(vowels.length)]);
		cb.append(lowers[rand.nextInt(lowers.length)]);
		cb.append(vowel[rand.nextInt(vowel.length)]);
		}
		
		cb.append(" ");  //把这个空格加上才是10个  下标  0-9
		
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(new RandomWords(10));
		while(s.hasNext())   
		//如果此扫描器的输入中有另一个标记，则返回 true。在等待要扫描的输入时，此方法可能阻塞。
		//扫描器将不执行任何输入。 
			System.out.println(s.next());
		//查找并返回来自此扫描器的下一个完整标记。完整标记的前后是与分隔模式匹配的输入信息。即使以前调用 hasNext() 返回了 true，
		//在等待要扫描的输入时此方法也可能阻塞。 
	}
	

}
