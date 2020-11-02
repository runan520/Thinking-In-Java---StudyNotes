package com.wuroc.chaptertwelve;

import java.util.function.Function;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-11-01 15:10
 */
public class FunctionComposition {
    String myGitHub = "https://github.com/WuRoc";
    static Function<String, String>
    f1 = s -> {
        System.out.println(s);
        return s.replace('A', '_');
    },
    //去除了前三个字符
    f2 = s -> s.substring(3),
    f3 = s -> s.toLowerCase(),
    //f2 调用在f1之前，
    f4 = f1.compose(f2).andThen(f3);

    public static void main(String[] args) {
        System.out.println(
                f4.apply("GO AFTER ALL AMBULANCES"));
    }
}
