package com.wuroc.chaptereleven;

import com.typeinfo.pets.Pet;
import com.typeinfo.pets.Pets;

;import java.util.Iterator;
import java.util.List;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-04 21:44
 */
public class SimpleIteration {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        List<Pet> pets = Pets.list(12);
        Iterator<Pet> it = pets.iterator();
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");

        }
        System.out.println();
        //如果可能的话，一种更简单的方法
        for (Pet p : pets)
            System.out.print(p.id() + ":" + p + " ");
        System.out.println();

        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            //生成的最后一个元素，这意味着在调用 remove() 之前必须先调 用 next()
            it.next();
            it.remove();
        }
        System.out.println(pets);

    }


}






