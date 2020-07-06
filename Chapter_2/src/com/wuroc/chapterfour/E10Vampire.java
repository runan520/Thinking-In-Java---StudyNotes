//: E10Vampire.java

package com.wuroc.chapterfour;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月6日
 *
 * 
 */
public class E10Vampire {
	public static void main(String[] args) {
			
	int[] startDight = new int[4];
	int[] productDight = new int[4];	
	for(int num1 = 10; num1 <= 99;num1++)
		for(int num2 = num1; num2 <= 99; num2++) {
			//Pete Hartley's theoretical result:
			//If x.y is vampire number then
			//x*y == x + y (mod 9)
			if((num1 * num2) %9 != (num1 + num2) % 9)
				continue;
			
			int product = num1 * num2;
			startDight[0] = num1 / 10;
			startDight[1] = num1 % 10;
			startDight[2] = num2 / 10;
			startDight[3] = num2 % 10;
			productDight[0] = product / 1000;
			productDight[1] = (product % 1000) / 100;
			productDight[2] = (product % 1000 % 100 / 10);
			productDight[3] = (product % 1000 % 100 % 10);
			int count = 0;
			for(int x = 0; x < 4; x++)
				for(int y =0; y < 4; y++) {
					if(productDight[x] == startDight[y]) {
						count++;
						//这里只是把productDight[x] startDight[y]标记一下，
						//对应的书全部无用，不再进行比较。
						productDight[x] = -1;
						startDight[y] = -7;
						if(count == 4)
							System.out.println(num1 + " " + num2 + " : " + product);
					} 
				}
			
		}
}

}/*Output:
	15 93 : 1395
	21 60 : 1260
	21 87 : 1827
	27 81 : 2187
	30 51 : 1530
	35 41 : 1435
	80 86 : 6880
*///:~ WuRoc



