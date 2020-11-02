package com.wuroc.chaptereleven;

import com.typeinfo.pets.Cat;
import com.typeinfo.pets.Dog;
import com.typeinfo.pets.Hamster;
import com.typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

;
;import static com.wuroc.util.Print.print;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-06 19:06
 */
public class PetMap {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<String, Pet>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));

        //new Hamster("Bosco")  produce  a
        petMap.put("My Hamster", new Hamster("Bosco"));
        print(petMap);
        Pet dog = petMap.get("My Dog");
        print(dog);
        print(petMap.containsKey("My Dog"));
        print(petMap.containsValue(dog));
    }
}
