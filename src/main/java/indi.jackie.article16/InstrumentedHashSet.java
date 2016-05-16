package indi.jackie.article16;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class InstrumentedHashSet<E> extends HashSet<E>{
    private int addCount=0;

    public InstrumentedHashSet(){

    }

    public InstrumentedHashSet(int initCap, float loadFactor){
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e){
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c){
        addCount+=c.size();
        return super.addAll(c);
    }

    public static void main(String [] args){
        InstrumentedHashSet<String> i=new InstrumentedHashSet<String>();
        i.addAll(Arrays.asList("a","b","c"));
        System.out.println("addCount="+i.addCount);
    }
}