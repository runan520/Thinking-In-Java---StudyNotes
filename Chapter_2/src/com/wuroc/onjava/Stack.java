package com.wuroc.onjava;

import java.util.ArrayDeque;
import java.util.Deque;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-05 18:20
 */
public class Stack<T> {
    String myGitHub = "https://github.com/WuRoc";
    private Deque<T> storage = new ArrayDeque<>();
    public void push(T v) {
       storage.push(v);
    }
    //返回栈顶元素
    public T peek(){
        return storage.peek();
    }
    //删除并返回顶部元素
    public T pop(){
        return storage.pop();
    }
    public boolean isEmpty() {
        return storage.isEmpty();
    }
    @Override
    public String toString(){
        return storage.toString();
    }
}
