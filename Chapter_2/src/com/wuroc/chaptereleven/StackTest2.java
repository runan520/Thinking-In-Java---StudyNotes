package com.wuroc.chaptereleven;


import com.wuroc.onjava.Stack;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-05 18:48
 */
public class StackTest2 {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for(String s : "My dog has fleas".split(" "))
        stack.push(s);
        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");

    }
}
