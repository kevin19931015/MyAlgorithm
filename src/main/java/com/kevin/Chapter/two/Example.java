package com.kevin.Chapter.two;

import edu.princeton.cs.introcs.StdOut;

public class Example {
    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    public static void exch(Comparable[] c,int i,int j){
        Comparable t = c[i];
        c[i] = c[j];
        c[j] = t;
    }
    public static void show(Comparable[] c){
        for(Comparable cc:c){
            StdOut.print(cc+" ");
        }
        StdOut.println();
    }
    public static boolean isSorted(Comparable[] c){
        boolean flag = true;
        for(int i=0;i<c.length-1;i++){
            if(!less(c[i],c[i+1])){
                flag = false;
                break;
            }
        }
        return flag;
    }

}
