package com.wuroc.chaptereleven;

import java.util.HashSet;
import java.util.Set;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-05 19:29
 */
public class SetOfString {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        for(int i = 0; i < 100; i++){
            colors.add("Yellow");
            colors.add("Blue");
            colors.add("Red");
            colors.add("Red");
            colors.add("Orange");
            colors.add("Yellow");
            colors.add("Blue");
            colors.add("Purple");

        }
        System.out.println(colors);
    }
}
