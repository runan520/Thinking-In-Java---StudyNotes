package com.wuroc.chaptereleven;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-07 12:48
 */
public class QueueDemo {
    String myGitHub = "https://github.com/WuRoc";
    public static void printQ(Queue queue) {
        //peek（）与element（）不移除的情况下返回队头
        while(queue.peek() != null)
            //remove（）移除并返回队头
            System.out.print(queue.remove() + " ");
        System.out.println();

    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for(int i = 0; i < 10; i++)
            //offer()插入队尾
            queue.offer(rand.nextInt(i + 10));
            printQ(queue);
            Queue<Character> qc = new LinkedList<>();
            for(char c : "Brontosaurus".toCharArray())
                qc.offer(c);
            printQ(qc);

    }
}
