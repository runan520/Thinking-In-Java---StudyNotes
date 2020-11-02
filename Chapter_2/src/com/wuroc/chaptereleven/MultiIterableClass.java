package com.wuroc.chaptereleven;

import java.util.*;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-09 18:30
 */
public class MultiIterableClass extends IterableClass {
    String myGitHub = "https://github.com/WuRoc";

    public Iterable<String> reversed() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {

                    int current = words.length - 1;

                    public boolean hasNext() {
                        return current > -1;
                    }

                    public String next() {
                        return words[current--];
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }

                };
            }
        };
    }
    public Iterable<String> randomized(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffled = new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();

            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();
        for(String s : mic.reversed())
            System.out.print(s + " ");
        System.out.println();
        for(String s : mic.randomized())
            System.out.print(s + " ");
        System.out.println();
        for(String s : mic)
            System.out.print(s + " ");
    }
}


