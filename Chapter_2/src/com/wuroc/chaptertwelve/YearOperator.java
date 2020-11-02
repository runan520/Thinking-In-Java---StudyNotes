package com.wuroc.chaptertwelve;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-23 19:06
 */
public class YearOperator {
    String myGitHub = "https://github.com/WuRoc";
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
//        int year = 1900;
        //一元运算符优先级高于复制运算符高于二元运算符
        boolean a = (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0);
        boolean b = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        boolean c = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
//        == ！= 优先级高于|| &&
        boolean d = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        boolean e = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
