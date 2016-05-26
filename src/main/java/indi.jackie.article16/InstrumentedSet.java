package indi.jackie.article16;

import java.util.Collection;
import java.util.Set;

/**
 * Created by JackLab on 2016/5/26.
 */
public class InstrumentedSet<E> extends ForwardingSet<E> {

    private int addCount;

    public InstrumentedSet(Set<E> s) {
        super(s);
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

    public int getAddCount(){
        return this.addCount;
    }
}
