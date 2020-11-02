package com.wuroc.chaptertwelve;

/**
 * https://github.com/WuRoc
 * Lambda表达式，但需要注意：递归方法必须是实例变量或静态变量，否则会出现编译时错误。
 * 我们将为每个案例创建一个示例。
 * (页码340).
 * 0! = 1
 * @author WuRoc
 * @create 2020-10-10 17:42
 */
public class RecursiveFactorial {
    String myGitHub = "https://github.com/WuRoc";
    //fact 是一个静态变量
    static IntCall fact;

    public static void main(String[] args) {
        fact = n -> n == 0 ? 1 : n * fact.call(n - 1);
        for(int i = 0; i <= 10; i++)
            System.out.println(fact.call(i));
    }
}
