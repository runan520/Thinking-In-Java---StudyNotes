package com.wuroc.chaptereleven;

import java.util.Map;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-08 19:01
 */
public class EnvironmentVariables {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
//        System.getenv() 7返回一个 Map ，entrySet() 产生一个由 Map.
//        Entry 的元素构成的 Set ，
//        并且这个 Set 是一个 Iterable ，因此它可以用于 for­in 循环。
        for(Map.Entry entry: System.getenv().entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
