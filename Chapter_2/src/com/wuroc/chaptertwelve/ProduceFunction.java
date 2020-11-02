package com.wuroc.chaptertwelve;

import java.util.function.Function;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-31 22:06
 */
interface FuncSS extends Function<String, String> {}
public class ProduceFunction {
    String myGitHub = "https://github.com/WuRoc";
    static FuncSS produce(){
        return s -> s.toLowerCase();
    }
    public static void main(String[] args){
        FuncSS f = produce();
        System.out.println(f.apply("YELLING"));
    }


}
