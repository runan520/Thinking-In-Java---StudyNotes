package com.wuroc.chaptereleven;

import java.util.Arrays;
import java.util.Iterator;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-08 23:02
 */
public class ArrayIsNotIterable {
    String myGitHub = "https://github.com/WuRoc";
    static <T> void test(Iterable<T> ib) {
        for(T t : ib)
            System.out.print(t + " ");
        System.out.println();
    }
    public static void main(String args[]){
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
        //An array works in for-in, but it's not Iterable:
        //可以看出他不是Iterable
//        test(Strings);
        //You must explicitly convert it to an Iterable:
        test(Arrays.asList(strings));
    }
}
