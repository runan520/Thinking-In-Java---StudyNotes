package com.wuroc.chaptertwelve;

import com.sun.corba.se.spi.orbutil.closure.Closure;

;
;import java.util.function.*;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-11-01 14:36
 */
public class SharedStorage {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        Closure1 c1 = new Closure1();
        IntSupplier f1 = c1.makeFun(0);
        IntSupplier f2 = c1.makeFun(0);
        IntSupplier f3 = c1.makeFun(0);

        System.out.println(f1.getAsInt());
        System.out.println(f2.getAsInt());
        System.out.println(f3.getAsInt());


    }
}
