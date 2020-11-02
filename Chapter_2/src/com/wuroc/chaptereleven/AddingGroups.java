package com.wuroc.chaptereleven;

import java.util.*;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-03 21:16
 */
public class AddingGroups {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));
        //Runs significantly faster,but you can`t construct a Collection this way
//       但是，Collections.addAll() 运行得更快，而且很容易构建一个不包含元素的 Collection ，然后调用 Collections.addAll() ，因此这是首选方式。
        Collections.addAll(collection,11,12,13,14,15);

        Collections.addAll(collection,moreInts);
        //产生一个list
        //Arrays.asList  返回的是一个数组
        List<Integer> list = Arrays.asList(16,17,18,19,20);
        list.set(1,90);   //可以重新定义元素

//        list.add(21);   //运行时错误；无法调整基础数组的大小。
        System.out.println(collection);
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 6, 7, 8, 9, 10]
        System.out.println(list);  //output  :  [16, 90, 18, 19, 20]

    }
}
