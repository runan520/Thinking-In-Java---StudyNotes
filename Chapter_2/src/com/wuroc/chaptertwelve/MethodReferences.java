package com.wuroc.chaptertwelve;

/**
 * https://github.com/WuRoc
 * 方法引用没有历史包袱。方法引用组成：类名或对象名，后面跟 :: ，然后跟方法名称。
 *
 * (页码341).
 * @author WuRoc
 * @create 2020-10-10 23:56
 */
interface Callable {
    void call(String s);
}
class Describe {
    void show(String msg){
        System.out.println(msg);
    }

}

public class MethodReferences {
    String myGitHub = "https://github.com/WuRoc";
    static void hello(String name) {
                System.out.println("Hello, " + name);
    }
    static class Description {
        String about;
        Description(String desc){
            about = desc;
        }
        void help(String msg){    //help() 也符合，它是静态内部类中的非静态方法。
            System.out.println(about+ " " + msg);
        }
    }

    static class Helper {
        static void assist(String msg) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args){
        Describe d = new Describe();
        Callable c = d :: show;  //也可以用 d == new Describe()
        c.call("call()");  //我们现在可以通过调用 call() 来调用 show()，因为 Java 将 call() 映射到 show()。
        c = MethodReferences::hello;
        c.call("Bob");
        c = new Description("valuable") :: help;
        c.call("information");
        c = Helper :: assist;
        c.call("Help!");

    }

}
//call()
//Hello, Bob
//valuable information
//Help!
//先对