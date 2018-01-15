package com.kevin.Chapter.one;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key,int[] a){
        int first = 0;
        int last = a.length-1;
        while(first<=last){
            int mid = (first+last)/2;
            if(key>a[mid]){
                first = mid+1;
            }else if(key<a[mid]){
                last = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] ints = In.readInts(args[0]);
        Arrays.sort(ints);
        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();
            StdOut.println(rank(key,ints));
        }
    }

}
