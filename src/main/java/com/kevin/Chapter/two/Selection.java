package com.kevin.Chapter.two;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

import java.util.Arrays;

public class Selection {
    public static void sort(Comparable[] comparables){
        for(int i=0;i<comparables.length;i++)
            for (int j=i+1;j<comparables.length;j++)
                if(!Example.less(comparables[i],comparables[j]))
                    Example.exch(comparables,i,j);
    }

    public static void main(String[] args){
        String[] strs = In.readStrings(args[0]);
        System.out.println(System.currentTimeMillis());
        sort(strs);
        System.out.println(System.currentTimeMillis());
        System.out.println(Arrays.toString(strs));
    }
}
