package com.kevin.Chapter.two;

import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.introcs.In;
import sun.font.EAttribute;

import java.util.Arrays;

public class Shell {
    public static void sort(Comparable[] c){
        int N = c.length;
        int h = N/2;
        while(h>=1){
            for(int i=h;i<N;i++)
                for(int j=i;j>h-1&&Example.less(c[j],c[j-h]);j-=h)
                    Example.exch(c,j,j-h);
            h/=2;
        }
    }

    public static void main(String[] args){
        String[] strs = In.readStrings(args[0]);
        System.out.println(System.currentTimeMillis());
        sort(strs);
        System.out.println(System.currentTimeMillis());
        System.out.println(Arrays.toString(strs));
    }
}
