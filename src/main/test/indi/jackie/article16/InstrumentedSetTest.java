package indi.jackie.article16;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by JackLab on 2016/5/26.
 */
public class InstrumentedSetTest {
    @Test
    public void a(){
        InstrumentedSet<String> iSet=new InstrumentedSet<String>(new HashSet<String>());
        iSet.add("1");
        assertEquals(iSet.getAddCount(), 1);

        String[] temp={"2","3","4","5"};
        Set<String> tempSet=new HashSet<String>();
        Collections.addAll(tempSet,temp);
        iSet.addAll(tempSet);
        assertEquals(iSet.getAddCount(), 5);
    }
}
