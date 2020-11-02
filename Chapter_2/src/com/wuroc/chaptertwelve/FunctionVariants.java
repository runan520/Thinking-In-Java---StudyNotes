package com.wuroc.chaptertwelve;

import java.util.function.*;

;
;

/**
 * 下面枚举了基于 Lambda 表达式的所有不同 Function 变体的示例
 * https://github.com/WuRoc
 * 主方法中的每个测试都显示了 Function 接口中不同类型的 apply() 方法。每个都产生一个与 其关联的 Lambda 表达式的调用。
 * @author WuRoc
 * @create 2020-10-22 12:51
 */
class Foo {

}
class Bar{
    Foo f;
    Bar(Foo f) {
        this.f = f;
    }
}
class IBaz {
    int i;
    IBaz(int i) {
        this.i = i;
    }
}
class LBaz {
    long l;
    LBaz(long l) {
        this.l = l;
    }
}

class DBaz {
    double d;
    DBaz(double d) {
        this.d = d;
    }
}

public class FunctionVariants{
    String myGitHub = "https://github.com/WuRoc";
    static Function<Foo, Bar> f1 = f -> new Bar(f);
    static IntFunction<IBaz> f2 = i -> new IBaz(i);
    static LongFunction<LBaz> f3 = l -> new LBaz(l);
    static DoubleFunction<DBaz> f4 = d -> new DBaz(d);
    static ToIntFunction<IBaz> f5 = ib -> ib.i;
    static ToLongFunction<LBaz> f6 = lb -> lb.l;
    static ToDoubleFunction<DBaz> f7 = db -> db.d;
    static IntToLongFunction f8 = i -> i;
    static IntToDoubleFunction f9 = i -> i;
    static LongToDoubleFunction f10 = l -> l;
    static LongToIntFunction f11 = l -> (int)l;
    static DoubleToIntFunction f12 = d -> (int)d;
    static DoubleToIntFunction f13 = d -> (int)d;
    static DoubleToLongFunction f14 = d -> (long)d;

    public static void main(String[] args) {
        Bar b = f1.apply(new Foo());
        IBaz ib = f2.apply(11);
        LBaz lb = f3.apply(11);
        DBaz db = f4.apply(11);
        int i = f5.applyAsInt(ib);
        long l = f6.applyAsLong(lb);
        double d = f7.applyAsDouble(db);
        l = f8.applyAsLong(12);
        d = f9.applyAsDouble(12);
        d = f10.applyAsDouble(12);
        i = f11.applyAsInt(12);
        i = f12.applyAsInt(13.0);
        l = f13.applyAsInt(13.0);
        System.out.println(l);   //Output : 13
        System.out.println(i);




    }
}
