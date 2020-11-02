package com.wuroc.chaptereleven;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-05 19:59
 */
public class UniqueWords {
    String myGitHub = "https://github.com/WuRoc";
    public static void main(String[] args) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get("F:\\eclipse-workspace\\OnJava8\\src\\com\\wuroc\\chaptereleven\\SetOperations.java"));
        Set<String> words = new TreeSet<>();
        for(String line : lines)
            for(String word : line.split("\\W+"))
                if(word.trim().length() > 0)
                    words.add(word);
                System.out.println(words);
    }
}
