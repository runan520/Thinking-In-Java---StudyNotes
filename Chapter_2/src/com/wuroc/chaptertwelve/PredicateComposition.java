package com.wuroc.chaptertwelve;

import java.util.function.Predicate;
import java.util.stream.Stream;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-11-01 15:49
 */
public class PredicateComposition {
    String myGitHub = "https://github.com/WuRoc";
    static Predicate<String>
    p1 = s -> s.contains("bar"),
    p2 = s -> s.length() < 5,
    p3 = s -> s.contains("foo"),
    p4 = p1.negate().and(p2).or(p3);

    public static void main(String[] args) {
        Stream.of("bar", "foobar", "foobaz", "fongopuckey")
        .filter(p4)
                .forEach(System.out :: println);
    }
}

   // 从输出结果我们可以看到 p4 的工作流程：任何带有 foo 的东西都会留下，即使它的长度大于 5。 fongopuckey 因长度超出和不包含 bar 而被丢弃。
//foobar
//foobaz