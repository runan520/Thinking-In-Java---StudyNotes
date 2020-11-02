package com.wuroc.chaptereleven;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-05 19:15
 */
public class SetOfInteger {
    String myGitHub = "https://github.com/WuRoc";
    //Set 不保存重复的元素。
    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> intset = new HashSet<>();
        for(int i = 0; i < 10000; i++)
            //每个数只有一个实例出现在结果中
            intset.add(rand.nextInt(30));
        System.out.println(intset);

    }

}
