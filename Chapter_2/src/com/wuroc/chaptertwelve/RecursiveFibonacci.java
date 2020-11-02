package com.wuroc.chaptertwelve;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-10 17:45
 */
public class RecursiveFibonacci {
    String myGitHub = "https://github.com/WuRoc";
    IntCall fib;
    RecursiveFibonacci(){
        fib = n -> n == 0 ? 0 :
                   n == 1 ? 1 :
              fib.call(n - 1) + fib.call(n - 2);
    }

    int fibonacci(int n){
        return fib.call(n);
    }

    public static void main(String[] args) {
        RecursiveFibonacci rf = new RecursiveFibonacci();
        for(int i = 0; i <= 10; i++)
            System.out.println(rf.fibonacci(i));
    }
}
