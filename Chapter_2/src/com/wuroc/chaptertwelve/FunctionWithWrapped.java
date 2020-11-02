package com.wuroc.chaptertwelve;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-31 22:03
 */
public class FunctionWithWrapped {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        Function<Integer, Double> fid = i -> (double)i;
        IntToDoubleFunction fid2 = i -> i;
       /* @FunctionalInterface 2 public interface IntToDoubleFunction { 3 double applyAsDouble(int value); 4 }

        (页码355).*/
    }
}
