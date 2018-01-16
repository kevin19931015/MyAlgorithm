package com.kevin.Chapter.one;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class ufTest {
    public static void main(String[] args){
        int N = StdIn.readInt();
        UnionFind uf = new UnionFind(N);
        while (!StdIn.isEmpty()){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            uf.union(p,q);
            StdOut.println(uf.find(p)+"---"+uf.find(q));
            StdOut.println(p+"---"+q);
            StdOut.println(uf.count());
        }
    }
}
