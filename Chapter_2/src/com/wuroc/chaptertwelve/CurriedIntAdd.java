package com.wuroc.chaptertwelve;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-11-01 16:06
 */
public class CurriedIntAdd {
    String myGitHub = "https://github.com/WuRoc";
    public static void main(String args[]) {
        IntFunction<IntUnaryOperator> curriedIntAdd = a -> b -> a + b;
        IntUnaryOperator add4 = curriedIntAdd.apply(4);
        System.out.println(add4.applyAsInt(5));
    }
}
