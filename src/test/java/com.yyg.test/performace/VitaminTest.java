package com.yyg.test.performace;

import com.yyg.test.performance.Vitamin;
import org.junit.Test;

import java.util.Date;

/**
 * Created by yuanyangen on 17/5/3.
 */
public class VitaminTest {

    @Test
    public void tesVitamin() {
       Vitamin v = new Vitamin();
        try {
            for (int i = 0; i< 100; i++) {
                Date d = new Date();
                Long d1 = d.getTime();
                v.lookUpTest();
                Date d10 = new Date();
                Long d11 = d10.getTime();
                System.out.println(d11 - d1);

            }

        } catch (Exception e) {

        }


    }

}
