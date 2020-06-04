package com.wuroc.chaptertwo;
/**A class comment*/
public class ShowProperties { 
	//：main() 向你提供环境信息 
	public static void main (String[] args) {
		//:list() 方法将结果发送给他的参数：System.out
		System.getProperties().list(System.out);
		//:查询用户名
		System.out.println(System.getProperty("user.name"));
		//：
		System.out.println( 
			System.getProperty("java.library.path"));
		
	}

}///：~
