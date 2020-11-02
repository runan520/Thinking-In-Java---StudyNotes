package com.wuroc.chaptertwelve;

/**
 * 传统的方法
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-10 15:15
 */
interface  Strategy {
    String myGitHub = "https://github.com/WuRoc";
    String approach(String msg);

}
class Soft implements Strategy {

    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}
class Unrelated {
    static String twice(String msg) {
        return msg + " " + msg;
    }
}

public class Strategize {
    Strategy strategy;
    String msg;
    Strategize(String msg) {
        //在 Strategize 中，Soft 作为默认策略，在构造函数中赋值
        strategy = new Soft();
        this.msg = msg;
    }
//    现在，每次调用 communicate() 都会产生不同的行为，
//    具体取决于此刻正在使用的策略代 码对象。我们传递的是行为，而非仅数据。3

    void commuicate(){
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
//        一种略显简短且更自发的方法是创建一个匿名内部类。即使这样，
//        仍有相当数量的冗余代码。 你总是要仔细观察：“哦，原来这样，这里使用了匿名内部类。”

                Strategy[] strategies = new Strategy[] {
                new Strategy() {
                    @Override
                    public String approach(String msg) {
                        return msg.toUpperCase() + "!";
                    }
                },
                msg -> msg.substring(0, 5),
                        //Java 8 的方法引用，由 :: 区分。在 :: 的左边是类或对象的名称，
                        // 在 :: 的右边是方法的名 称，但没有参数列表。
                Unrelated::twice
        };

        Strategize s = new Strategize("Hello there");
        s.commuicate();
        for(Strategy newStrategy : strategies) {
            s.changeStrategy(newStrategy);
            s.commuicate();
        }

    }
}

