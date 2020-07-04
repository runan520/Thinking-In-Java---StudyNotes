//: Mathop.java

package com.wuroc.chapterthree;

import java.util.Random;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月1日
 *
 * 
 */
public class MathOp {
	
	public static void main(String[] args) {
		//创造一个随机种子
		Random rand = new Random(47);
		
		int i,j,k;
		
		//选择值1到100
		j = rand.nextInt(100)+1;
		
		print("j : " + j);
		
		k = rand.nextInt(100)+1;
		
		print("k : " + k);
		
		i = j + k;
		
		print("j + k : "+ i);
		
		i = j - k;
		
		print("j - k : " + i);
		
		i=k / j;
		
		print("k / j : " + i);
		
		i = k * j;
		print("k * j : " + i);
		
		i = k % j;
		
		print("k % j :" + i);
		//%=之间不可以有空格
		j %= k;
		//j %= k : 3  j : 59  k : 56
		print("j %= k : " + j);
		
		float v , u , w; 
		v = rand.nextFloat();
		print("v : " + v);
		
		w = rand.nextFloat();
		print("w : "+ w);
		
		u = v - w;
		print("v - w : "+ u);
		
		
		
		
		
		
		
		
	}
	

}/* Output:
j : 59
k : 56
j + k : 115
j - k : 3
k / j : 0
k * j : 3304
k % j :56
j %= k : 3
v : 0.5309454
w : 0.0534122
v - w : 0.47753322
*///:~
