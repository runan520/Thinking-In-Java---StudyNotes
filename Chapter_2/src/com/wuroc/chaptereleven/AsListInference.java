package com.wuroc.chaptereleven;

import java.util.*;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-03 21:54
 */

    class Snow{}
    class Powder extends Snow {}
    class Light extends Powder {}
    class Heavy extends Powder {}
    class Crusty extends Snow {}
    class Slush extends Snow {}
public class AsListInference {
    String myGitHub = "https://github.com/WuRoc";
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(
                new Crusty(), new Slush(),new Powder()
        );
//        snow1.add(new Heavy());
        List<Snow> snow2 = Arrays.asList(
                new Light(), new Heavy()
        );
//        snow2.add(new Slush());

        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3,new Light(), new Heavy(), new Powder());
        snow3.add(new Crusty());

        List<Snow> snow4 = Arrays.<Snow>asList(
                new Light(), new Heavy(), new Slush()
        );

//        snow4.add(new Powder());
    }
}
