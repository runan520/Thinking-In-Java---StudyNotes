package com.wuroc.chaptereleven;

import com.typeinfo.pets.Hamster;
import com.typeinfo.pets.Pet;
import com.typeinfo.pets.Pets;
import com.typeinfo.pets.Rat;

import java.util.LinkedList;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-04 23:04
 */
public class LinkedListFeatures {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.list(5));
        System.out.println(pets);

        //Identical
        System.out.println("pets.getFirst(): " + pets.getFirst());
        System.out.println("pets.element(): " + pets.element());
        System.out.println("pets.peek(): " + pets.peek());
        System.out.println("pets.remove(): " + pets.remove());
        System.out.println("pets.removeFirst(): " + pets.removeFirst());
        System.out.println("pets.poll(): " + pets.poll());
        System.out.println(pets);
        pets.addFirst(new Rat());
        System.out.println("After addFirst(): " + pets);
        pets.offer(Pets.get());
        System.out.println("After offer(): " + pets);
        pets.add(Pets.get());
        System.out.println("After add(): " + pets);
        pets.addLast(new Hamster());
        System.out.println("After addLast(): " + pets);
        System.out.println("pets.removeLast(): " + pets.removeLast());
        System.out.println(pets);

    }
}
