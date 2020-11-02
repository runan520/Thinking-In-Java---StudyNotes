package com.wuroc.chaptereleven;

import com.typeinfo.pets.Pet;
import com.typeinfo.pets.Pets;

import java.util.*;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-04 22:14
 */
public class CrossCollectionIteration2 {
    String myGitHub = "https://github.com/WuRoc";
    public static void display(Iterable<Pet> ip){
        Iterator<Pet> it = ip.iterator();
        while(it.hasNext()){
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " " );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> pets = Pets.list(8);
        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        HashSet<Pet> petsHS = new HashSet<>(pets);
        TreeSet<Pet> petsTS = new TreeSet<>(pets);
        display(pets);
        display(petsLL);
        display(petsHS);
        display(petsTS);

    }
}
