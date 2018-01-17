package com.kevin.Chapter.two;

import edu.princeton.cs.introcs.In;

import java.util.Arrays;

public class Fast {
    public static int partition(Comparable[] c,int lo,int hi){
        int i = lo;
        int j = hi+1;
        while(true){
            while(Example.less(c[++i],c[lo])){
                if(i==hi) break;
            }
            while(Example.less(c[lo],c[--j])){
            }
            if(j<=i)break;
            Example.exch(c,i,j);
        }
        Example.exch(c,j,lo);
        return j;
    }

    public static void sort(Comparable[] c,int lo,int hi){
        if(lo>=hi) return;
        int m = partition(c,lo,hi);
        sort(c,lo,m-1);
        sort(c,m+1,hi);
    }

    public static void sort(Comparable[] c){
        sort(c,0,c.length-1);
    }

    public static void main(String[] args){
        String[] strs = In.readStrings(args[0]);
        System.out.println(System.currentTimeMillis());
        sort(strs);
        System.out.println(System.currentTimeMillis());
        System.out.println(Arrays.toString(strs));
    }
}
