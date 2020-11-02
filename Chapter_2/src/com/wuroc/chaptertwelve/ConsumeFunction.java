package com.wuroc.chaptertwelve;

import java.util.function.Function;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-31 22:10
 */
class One{}
class Two{}
public class ConsumeFunction {
    String myGitHub = "https://github.com/WuRoc";
    static Two consume(Function<One, Two> onetwo) {
        return onetwo.apply(new One());
    }

    public static void main(String[] args) {
        Two two = consume(one -> new Two());
    }
}
