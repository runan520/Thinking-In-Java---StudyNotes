//: LabeledFor.java

package com.wuroc.chapterfour;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月6日
 *
 * 
 */
public class LabeledFor {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		outer: //此处不允许存在执行语句
			
			for(;true;) {
				
				inner: //此处不允许存在执行语句
					
					for(;i < 10; i++) {
						
						System.out.println("i = " + i);
						
						if(i == 2) {
							
							System.out.println("continue");
							
							continue;
						}
						
						if(i == 3) {
							
							System.out.println("break");
							
							i++; //获得自增，否则无法获得自增
							
							break;
							
						}
						
						if(i == 7) {
							
							System.out.println("continue outer");
							
							i++;
							
							continue outer;
							
						}
						
						if(i  == 8) {
							System.out.println("break outer");
							break outer;
						}
						
						for(int k = 0;k < 5; k++) {
							//两个for循环，外部执行一次，里面执行5次
							if(k == 3) {
								
								System.out.println("continue inner");
								
								continue inner;
							}
						}
					}
			}
	}
	
}









