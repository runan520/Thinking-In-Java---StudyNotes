package com.wuroc.chaptertwelve;

import java.util.function.Function;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-11-01 16:03
 */
public class curry3Args {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        Function<String, Function<String, Function<String, String>>> sum = a -> b -> c -> a + b + c;
        Function<String, Function<String, String>> hi = sum.apply("Hi ");
        Function<String, String> ho = hi.apply("Ho ");
        System.out.println(ho.apply("Hup "));
    }
}
