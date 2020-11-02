 package com.wuroc.chaptereleven;

import java.util.Iterator;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-08 18:47
 */
public class IterableClass  implements Iterable<String>{
    String myGitHub = "https://github.com/WuRoc";
    protected String[] words = ("And that is how we know the Earth to banana-shaped.").split(" ");

    public Iterator<String> iterator(){
        return new Iterator<String>() {
            public int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main (String args[]) {
        for (String s : new IterableClass())
            System.out.print(s + " ");
    }
}
