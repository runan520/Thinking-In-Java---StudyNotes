package com.wuroc.chaptereleven;

import java.util.*;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-07 17:13
 */
public class PriorityQueueDemo {
    String myGitHub = "https://github.com/WuRoc";

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(47);
        for(int i = 0; i < 10; i++)
            priorityQueue.offer(rand.nextInt(i + 10));
        QueueDemo.printQ(priorityQueue);
        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 1, 2, 3, 9, 18,21, 23, 25);
        priorityQueue = new PriorityQueue<>(ints);
        QueueDemo.printQ(priorityQueue);
//        Collections.reverseOrder() 为了展示如何通过提供自己的 Comparator 对象来改变顺序，第三个 对 PriorityQueue<Integer> 构造器的调用，
//        和第二个对 PriorityQueue<String> 的调用使用了由 Collections.reverseOrder() （Java 5 中新添加的）产生的反序的 Comparator
        priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);
        QueueDemo.printQ(stringPQ);
        stringPQ = new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ);

        Set<Character> charSet = new HashSet<Character>();
        for(char c : fact.toCharArray())
            charSet.add(c);
        PriorityQueue<Character> characterPQ = new PriorityQueue<>(charSet);
        QueueDemo.printQ(characterPQ);


        }

}
