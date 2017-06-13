package com.yyg.test.functional;

import org.junit.Test;

/**
 * Created by yuanyangen on 17/5/6.
 */
public class EqualsTest {
    @Test
    public void testEquals() {
        Equals e = new Equals();
        e.equalList();

    }

    @Test
    public void testEqualsMap() {
        Equals e = new Equals();
        e.equalHash();

    }

    @Test
    public void testEqualsRMap() {
        Equals e = new Equals();
        e.equalRecureHash();

    }

}
