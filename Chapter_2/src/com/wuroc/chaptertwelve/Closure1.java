package com.wuroc.chaptertwelve;

import java.util.function.IntSupplier;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-31 22:30
 */
public class Closure1 {
    String myGitHub = "https://github.com/WuRoc";
    int i;
    IntSupplier makeFun(int x){
        return () -> x + i++;
    }
}
