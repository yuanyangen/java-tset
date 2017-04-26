package com.yyg.test;

import org.junit.Test;

/**
 * Created by yuanyangen on 17/4/17.
 */
public class CopyTest {

    @Test
    public void copy1Test() {
        System.out.println("apache");
        Copy c = new Copy();
        c.beatCopySpring();

    }

    @Test
    public void copy2Test() {
        System.out.println("set");
        Copy c = new Copy();
        c.beatCopySet();

    }

    @Test
    public void copy3Test() {
        System.out.println("set");
        Copy c = new Copy();
        c.beatCopyWdp();

    }


}
