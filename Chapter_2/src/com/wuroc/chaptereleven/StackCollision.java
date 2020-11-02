package com.wuroc.chaptereleven;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-05 19:03
 */
public class StackCollision {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        com.wuroc.onjava.Stack<String> stack = new com.wuroc.onjava.Stack<>();
        for(String s : "My dog has fleas".split(" "))
        stack.push(s);
        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");
        System.out.println();
        java.util.Stack<String> stack2 = new java.util.Stack<>();
        for(String s : "My dog has fleas".split(" "))
            stack2.push(s);
        while(!stack2.isEmpty())
            System.out.print(stack2.pop() + " ");

    }
}
