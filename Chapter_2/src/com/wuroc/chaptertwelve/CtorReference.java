package com.wuroc.chaptertwelve;

;
;

/**
 * 构造函数引用
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-22 10:51
 */
class Dog {
    String name;
    int age = -1;
    Dog() {
        name = "stray";
    }
    Dog(String nm) {
        name = nm;
    }
    Dog(String nm, int yrs){
            name = nm;
            age = yrs;
        }
    }
interface MakeNoArgs {
    Dog make();
}
interface Make1Args {
    Dog make(String nm);
}
interface Make2Args {
    Dog make(String nm, int age);  //og(String nm, int yrs)参数可以不相同
}

public class CtorReference {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        MakeNoArgs mna = Dog :: new;
        Make1Args m1a = Dog::new;
        Make2Args m2a = Dog::new;

        Dog dn = mna.make();
        Dog d1 = m1a.make("Comet");
        Dog d2 = m2a.make("Ralph", 4);


    }
}
