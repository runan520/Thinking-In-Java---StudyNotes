package com.wuroc.chaptereleven;

import com.typeinfo.pets.Pet;
import com.typeinfo.pets.Pets;

;
;import java.util.*;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-04 21:58
 */
public class CrossCollectionIteration {
    String myGitHub = "https://github.com/WuRoc";
    public static void display(Iterator<Pet> it){
        while(it.hasNext()){
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> pets = Pets.list(8);
        //迭代器统一对集合的访问方式
        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        HashSet<Pet> petsHS = new HashSet<>(pets);
        //升序
        TreeSet<Pet> petsTS = new TreeSet<>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }
}
