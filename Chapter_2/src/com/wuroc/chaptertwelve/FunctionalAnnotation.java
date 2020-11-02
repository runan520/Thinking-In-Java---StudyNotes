package com.wuroc.chaptertwelve;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-22 11:38
 */
@FunctionalInterface
interface Functional {
    String goodbye(String arg);

}
interface FunctionalNoAnn {
    String goodbye(String arg);
}
/*@FunctionalInterface
//在接口com.wuroc.chaptertwelve.NotFunctional
// 中找到多个非覆盖的抽象方法
interface NotFunctional {
    String goodbe(String arg);
    String hello(String arg);
}*/
public class FunctionalAnnotation {
    String myGitHub = "https://github.com/WuRoc";
    public String goodbye(String arg){
        return "Goodbye, " + arg;

    }
    public static void main(String[] args){
        FunctionalAnnotation fa = new FunctionalAnnotation();
        Functional f = fa :: goodbye;
        FunctionalNoAnn fna = fa :: goodbye;
        //这个地方是public String goodbye(String arg){
        //return "Goodbye, " + arg;
//        Functional fac = fa;
        Functional fl = a -> "Goodbye, " + a;
        FunctionalNoAnn fnal = a -> "Goodbye, " + a;
        System.out.println(fl.goodbye("s"));
        System.out.println(fnal.goodbye("a"));

    }

}
