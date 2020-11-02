package com.wuroc.chaptereleven;

import com.typeinfo.pets.Pet;
import com.typeinfo.pets.Pets;

;
;import java.util.*;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-07 17:54
 */
public class InterfaceVsIterator {
    String myGitHub = "https://github.com/WuRoc";

    public static void display(Iterator<Pet> it){
//        使用 next() 方法获得序列中的下一个元素。
//        使用 hasNext() 方法检查序列中是否还有元素。
        while(it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void display(Collection<Pet> pets) {
        for(Pet p : pets)
            System.out.print(p.id() + ":" + p + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        List<Pet> petList = Pets.list(8);
        Set<Pet> petSet = new HashSet<Pet>(petList);
        Map<String, Pet> petMap = new LinkedHashMap<String, Pet>();
        String[] names = ("Ralph, Eric, Robin, Lacey, Britney, Sam, Spot, Fluffy").split(", ");
        for(int i = 0; i < names.length; i++)
            petMap.put(names[i], petList.get(i));
        display(petList);
        display(petSet);
        display(petList.iterator());
        display(petSet.iterator());
        System.out.println(petMap);
        System.out.println(petMap.keySet());
        display(petMap.values());
        display(petMap.values().iterator());

        }


    }

