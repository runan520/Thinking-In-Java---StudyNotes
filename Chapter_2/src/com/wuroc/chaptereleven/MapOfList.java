package com.wuroc.chaptereleven;

import com.typeinfo.pets.*;
import sun.awt.windows.WPrinterJob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

;
;import static com.wuroc.util.Print.print;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-06 22:10
 */
public class MapOfList {
    String myGitHub = "https://github.com/WuRoc";
    public static Map<Person, List<? extends Pet>> petPeople = new HashMap<Person, List<? extends Pet>>();
    static{
        //Arrays.asList() 是将数组作为集合
        petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"),new Mutt("Spot")));
        petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Shackleton"), new Cat("Elsie May"), new Dog("Margrett")));
        petPeople.put(new Person("Marilyn"), Arrays.asList(new Pug("Louie aka Louis Snorkelstein Dupree"), new Cat("Stanfored aka Stinky el Negro")));

    }

    public static void main(String[] args) {
        print("People: " + petPeople.keySet());
        print("Pets: " + petPeople.values());
        for(Person person : petPeople.keySet()){
            print(person + " has: ");
            //如果键不在容器中，get()方法将返回null（这表示该数字第一次被找到），get（）方法将产生与该键相联的Integer值
            for(Pet pet : petPeople.get(person))
                print("   " + pet);
        }
    }

}










