package com.wuroc.chaptertwelve;

;
;

/**
 * 没 有 方 法 引 用 的 对 象
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-22 10:04
 */
class X {
    String f() {
        return "X::f()";
        }
        }

interface MakeString {
    String make();
        }

interface TransformX {
    String transform(X x);
        }

public class UnboundMethodReference {
    String myGitHub = "https://github.com/WuRoc";
    public static void main(String[] args) {
        // MakeString ms = X :: f;
        TransformX sp = X ::f;
        X x = new X();
        System.out.println(sp.transform(x));
        System.out.println(x.f());
    }
}
//X::f()
//X::f()