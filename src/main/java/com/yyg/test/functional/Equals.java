package com.yyg.test.functional;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yuanyangen on 17/5/6.
 */
public class Equals {
    public void equalList() {
        List<Long> list1 = new ArrayList<Long>();
        list1.add(1L);
        list1.add(2L);
        list1.add(3L);

        List<Long> list2 = new ArrayList<Long>();
        list2.add(2L);
        list2.add(2L);
        list2.add(3L);
        Boolean r = list1.equals(list2);
        System.out.println(r);
    }

    public void equalHash() {
        Map<Long, Long> m1 = new HashMap<Long, Long>();
        m1.put(1L,2L);
        m1.put(2L,2L);
        m1.put(3L,2L);

        Map<Long, Long> m2 = new HashMap<Long, Long>();
        m2.put(1L,2L);
        m2.put(2L,2L);
        m2.put(3L,2L);

        Boolean r = m1.equals(m2);
        System.out.println(r);
    }

    public void equalRecureHash() {
        Map<Long, Map<Long,Long>> r1 = new HashMap<Long, Map<Long, Long>>();
        Map<Long, Long> m1 = new HashMap<Long, Long>();
        m1.put(1L,2L);
        m1.put(2L,2L);
        m1.put(3L,2L);
        r1.put(1L, m1);



        Map<Long, Map<Long,Long>> r2 = new HashMap<Long, Map<Long, Long>>();
        Map<Long, Long> m2 = new HashMap<Long, Long>();
        m2.put(1L,2L);
        m2.put(2L,22L);
        m2.put(3L,2L);
        r2.put(1L, m2);

        Boolean r = r1.equals(r2);
        System.out.println(r);
    }
}
