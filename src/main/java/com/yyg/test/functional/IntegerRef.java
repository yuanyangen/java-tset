package com.yyg.test.functional;

import com.weidian.wdp.slf4j.Logger;
import com.weidian.wdp.slf4j.LoggerFactory;

/**
 * Created by yuanyangen on 17/4/17.
 */
public class IntegerRef {

    public void testCompare() {
        Integer a = 1;
        Integer b = 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }


}
