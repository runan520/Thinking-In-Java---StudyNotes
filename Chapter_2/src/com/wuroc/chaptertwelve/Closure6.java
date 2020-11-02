package com.wuroc.chaptertwelve;

import java.util.function.IntSupplier;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-11-01 14:48
 */
public class Closure6 {
    String myGitHub = "https://github.com/WuRoc";
    IntSupplier makeFun(int x) {
        int i = 0;
        i++;
        x++;
        final int iFinal = i;
        final int xFinal = x;
        return () -> xFinal + iFinal;
    }
}
