package com.wuroc.chaptereleven;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-08 18:38
 */
public class ForEachCollections {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs,"Take the long way home".split(" "));
        for(String s : cs)
            System.out.print("'" + s + "' ");


    }
}
