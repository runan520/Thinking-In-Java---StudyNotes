package com.wuroc.chaptertwelve;

;
;

/**
 * 未 绑 定 的 方 法 与 多 参 数 的 结 合 运 用  (页码345).
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-22 10:40
 */
class This {
    void two (int i, double d) {}
    void three(int i, double d, String s) {}
    void four(int i, double d, String s, char c){}
}
interface TwoArgs {
    void call2(This athis, int i, double d);
}
interface ThreeArgs {
    void call3(This athis, int i, double d, String s);
}
interface FourArgs {
    void call4(This athis, int i, double d, String s, char c);
}

public class MultiUnbound {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        TwoArgs twoArgs = This :: two;
        ThreeArgs threeArgs = This :: three;
        FourArgs fourArgs = This :: four;
        This athis = new This();
        twoArgs.call2(athis, 11, 3.14);
        threeArgs.call3(athis, 11, 3.14, "Three");
        fourArgs.call4(athis, 11, 3.14, "Four", 'Z');
    }
}
