package com.wuroc.chaptertwelve;

import java.util.function.IntSupplier;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-11-01 15:07
 */
public class AnonymousClosure {
    String myGitHub = "https://github.com/WuRoc";
    IntSupplier makeFun(int x) {
        int i = 0;
        return new IntSupplier() {
            @Override
            public int getAsInt() {

                return x + i;
            }
        };
    }
}
