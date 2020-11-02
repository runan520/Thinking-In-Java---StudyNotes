package com.wuroc.chaptereleven;

import java.util.Set;
import java.util.TreeSet;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-05 19:36
 */
public class SortedSetOfString {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        Set<String> colors1 = new TreeSet<>();
        for(int i = 0; i < 100; i++){
            colors1.add("Yellow");
            colors1.add("Blue");
            colors1.add("Red");
            colors1.add("Red");
            colors1.add("Orange");
            colors1.add("Yellow");
            colors1.add("Blue");
            colors1.add("Purple");
        }
        System.out.println(colors1);
    }
}
