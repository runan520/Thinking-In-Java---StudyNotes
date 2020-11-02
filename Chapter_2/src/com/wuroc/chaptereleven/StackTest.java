package com.wuroc.chaptereleven;

import java.util.ArrayDeque;
import java.util.Deque;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-05 18:11
 */
public class StackTest {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        for(String s : "My dog has fleas".split(" "))
            stack.push(s);  //放进去
        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");  //输出
    }
}
