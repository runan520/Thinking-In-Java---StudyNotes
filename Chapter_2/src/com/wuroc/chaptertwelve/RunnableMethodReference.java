package com.wuroc.chaptertwelve;

;
;

/**
 * 方 法 引 用 与 Runnable 接 口 的 结 合 使 用  (页码343).
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-22 9:33
 */
class Go {
    static void go(){
        System.out.println("Go ::go()");
    }
}

public class RunnableMethodReference {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous");
            }
        }).start();
        new Thread(() -> System.out.println("lambda")).start();  //空的方法调用 ->后面是方法题体

        new Thread(Go ::go).start();
    }
}
//Thread 对象将 Runnable 作为其构造函数参数，并具有会调用 run() 的方法 start()。注意，
//只有匿名内部类才需要具有名为 run() 的方法。
