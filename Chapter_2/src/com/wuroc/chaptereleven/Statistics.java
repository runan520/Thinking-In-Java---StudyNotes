package com.wuroc.chaptereleven;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-06 18:57
 */
public class Statistics {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0; i < 1000; i++){
            //Produce a number between 0 and 20
            int r = rand.nextInt(20);
            //得到R然后向上转型Integer
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
