package com.wuroc.chaptereleven;

import java.util.*;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-03 22:07
 */
public class PrintingCollections {
    String myGitHub = "https://github.com/WuRoc";
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }
    public static void main(String[] args){
        System.out.println(fill(new ArrayList<>()));
        System.out.println(fill(new LinkedList<>()));
        //HashSet检测元素最快的方法
        System.out.println(fill(new HashSet<>()));
        //如果储存顺序很重要,则可以使用TreeSet(),它将按比较结果的升序保存对象
        System.out.println(fill(new TreeSet<>()));
        System.out.println(fill(new LinkedHashSet<>()));
        //Map又称为关联数组,可以通过键来查找
        //Map自动调整大小,还知道如何打印自己,他会显示相关联的建和值
        System.out.println(fill(new HashMap<>()));
        //升序
        System.out.println(fill(new TreeMap<>()));
        //LinkHashMap在保持HashMap查找速度的同时按键的插入顺序保存键
        System.out.println(fill(new LinkedHashMap<>()));

    }
}
