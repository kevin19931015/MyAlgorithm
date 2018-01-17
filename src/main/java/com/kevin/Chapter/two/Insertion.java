package com.kevin.Chapter.two;

import edu.princeton.cs.introcs.In;

import java.util.Arrays;

public class Insertion {
    public static void sort(Comparable[] c){
        int N = c.length;
        for (int i=1;i<N;i++)
            for(int j=i;j>0&&Example.less(c[j],c[j-1]);j-=1)
                Example.exch(c,j,j-1);
    }

    public static void main(String[] args){
        String[] strs = In.readStrings(args[0]);
        System.out.println(System.currentTimeMillis());
        sort(strs);
        System.out.println(System.currentTimeMillis());
        System.out.println(Arrays.toString(strs));
    }


}
