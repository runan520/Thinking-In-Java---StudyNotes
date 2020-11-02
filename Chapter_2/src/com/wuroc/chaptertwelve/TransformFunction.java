package com.wuroc.chaptertwelve;

import java.util.function.Function;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-31 22:14
 */
class I {
    @Override
    public String toString() {
        return "I";
    }
}
class O {
        public String toString(){
            return "0";
        }

}

public class TransformFunction {
    String myGitHub = "https://github.com/WuRoc";
    static Function<I,O> transform(Function<I,O> in){
        return in.andThen(o -> {
            System.out.println(o);
            return o;
        });
    }
    public static void main(String[] args){
        Function<I,O> f2 = transform(i -> {
            System.out.println(i);
            return new O();
        });

        O o = f2.apply(new I());
    }
}
