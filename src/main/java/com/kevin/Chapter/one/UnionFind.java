package com.kevin.Chapter.one;

public class UnionFind implements com.kevin.Chapter.one.UF{

    private int[] a;
    private int[] size;
    private int count;

    public UnionFind(int N){
        count = N;
        a = new int[N];
        for(int i=0;i<N;i++){
            a[i]=i;
        }
        size = new int[N];
        for(int i=0;i<N;i++){
            size[i]=i;
        }
    }

    @Override
    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if(pId==qId)return;
        if(size[pId]<size[qId]){
            a[pId]=qId;
            size[qId]+=size[pId];
        }else{
            a[qId]=pId;
            size[pId]+=size[qId];
        }
        count--;
    }

    @Override
    public int find(int p) {
        while(p!=a[p])p=a[p];
        return p;
    }

    @Override
    public boolean connected(int p, int q) {
        return find(p)==find(q);
    }

    @Override
    public int count() {
        return count;
    }
}
