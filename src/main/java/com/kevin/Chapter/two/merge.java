package com.kevin.Chapter.two;

import edu.princeton.cs.introcs.In;

import java.util.Arrays;

public class merge {

    private static Comparable[] aux;

    public static void sort(Comparable[] c){
        aux = new Comparable[c.length];
        sort(c,0,c.length-1);
    }

    public static void sort(Comparable[] c,int f,int l){
        if(f>=l)return;
        int mid = f+(l-f)/2;
        sort(c,f,mid);
        sort(c,mid+1,l);
        merge(c,f,mid,l);
    }

    public static void merge(Comparable[] c,int f,int m,int l){
        int i = f;
        int j = m+1;
        for(int k=f;k<=l;k++){
            aux[k] = c[k];
        }
        for(int k=f;k<=l;k++){
            if(i>m) c[k]=aux[j++];
            else if(j>l) c[k]=aux[i++];
            else if(Example.less(aux[i],aux[j])) c[k]=aux[i++];
            else c[k]=aux[j++];
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
