package com.yyg.test.functional;

/**
 * Created by yuanyangen on 17/5/6.
 */
public class Number {

    public void testLong() {

        long a= 0xffffffffffL;
        for(int i =0; i< 100; i++) {
            a += a;
            System.out.println(a);
        }
    }

}
