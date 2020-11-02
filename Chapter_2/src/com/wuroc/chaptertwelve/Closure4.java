package com.wuroc.chaptertwelve;

import java.util.function.IntSupplier;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-11-01 14:44
 */
public class Closure4 {
    String myGitHub = "https://github.com/WuRoc";
    IntSupplier makeFun(final int x){
        final int i = 0;
        return () -> x + i;
    }
}
