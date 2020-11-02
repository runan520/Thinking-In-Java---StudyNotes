package com.wuroc.chaptertwelve;

import java.util.*;


public class  As{
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param ipArr string字符串一维数组 待校验 IP 列表
     * @param blackIpArr string字符串一维数组 IP 黑名单列表
     * @return bool布尔型一维数组
     */
    public boolean[] isBlackIp (String[] ipArr, String[] blackIpArr) {
        // write code here
        for(int i = 0; i < ipArr.length; i++)
        for(int j = 0; j < blackIpArr.length; j++)
            if(ipArr[i] == blackIpArr[j])
                return new boolean[]{false};
        return new boolean[0];
    }

    public static void main(String[] args) {
        String[] a = new String[]{"1","2","3"};

        String[] b= new String[]{"1"};
        As s = new As();
        System.out.println(s.isBlackIp(a,b));
    }
}