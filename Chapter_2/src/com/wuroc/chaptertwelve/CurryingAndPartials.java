package com.wuroc.chaptertwelve;

import java.util.function.Function;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-11-01 15:57
 */
public class CurryingAndPartials {
    String myGitHub = "https://github.com/WuRoc";
    static String uncurried(String a, String b){
        return a + b;
    }
    public static void main(String[] args){
        Function<String, Function<String, String>> sum = a -> b -> a + b;
        System.out.println(uncurried("Hi ", "Ho"));

        Function<String, String>
                hi = sum.apply("Hi ");
        System.out.println(hi.apply("Ho "));

        Function<String, String> sumHi = sum.apply("Hup ");
        System.out.println(sumHi.apply("Ho "));
        System.out.println(sumHi.apply("Hey "));
    }
}
//Hi Ho
//Hi Ho
//Hup Ho
//Hup Hey