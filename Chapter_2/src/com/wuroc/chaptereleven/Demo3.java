package com.wuroc.chaptereleven;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-06 20:41
 */
public class Demo3 {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        int sum = 0;
        for (int x = 0; x < 10; x++) {
            sum += x;
            if (sum % 3 == 0) {
                break;
            }

        }
        System.out.println(sum);
    }
}
