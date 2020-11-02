package com.wuroc.chaptereleven;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-06 19:33
 */
public class Happy {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {

    int i = 1;
    int j = i++;
    if((i == (++j))&&((i++)==j)) {
        i +=j;
    }
    System.out.println("i= "+ i);
    }
}
