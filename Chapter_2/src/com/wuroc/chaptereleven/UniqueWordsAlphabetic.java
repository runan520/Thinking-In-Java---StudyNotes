package com.wuroc.chaptereleven;

import java.io.File;
import java.io.IOException;
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
 * @create 2020-10-05 20:19
 */
public class UniqueWordsAlphabetic {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("F:\\eclipse-workspace\\OnJava8\\src\\com\\wuroc\\chaptereleven\\SetOperations.java"));
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for(String line : lines)
            /*regex -- 正则表达式分隔符
        limit -- 分割的份数*/
            for(String word : line.split("\\W+"))
                //trim() 方法用于删除字符串的头尾空白符
                if(word.trim().length() > 0)
                    words.add(word);
                System.out.println(words);


    }
}
