package com.yyg.test.performance;

import org.apache.commons.beanutils.PropertyUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yuanyangen on 17/4/17.
 */
public class StrPerfomance {
    public void replaceT() {

        Date d = new Date();
        Long d1 = d.getTime();


        try {
            for (int i = 0; i< 10000; i++) {
                String str = "1666413454, 1677544372, 1647486484, 671091708, 522743260, 503445566, 488260940, 488257700, 347029896, 245327071";
                String[] strList = str.split(",", -1);
                List<String> ids = new ArrayList<String>();
                for (String one : strList) {
                    one = one.trim();
                    ids.add(one);
                }

            }

        } catch (Exception e) {

        }
        Date d10 = new Date();
        Long d11 = d10.getTime();
        System.out.println(d11 - d1);

    }

    public void replaceT2() {

        Date d = new Date();
        Long d1 = d.getTime();


        try {
            for (int i = 0; i< 10000; i++) {
                String str = "1666413454, 1677544372, 1647486484, 671091708, 522743260, 503445566, 488260940, 488257700, 347029896, 245327071";
                str = str.replace(" ", "");
                String[] strList = str.split(",", -1);
                List<String> ids = new ArrayList<String>();
                for (String one : strList) {
                    ids.add(one);
                }

            }

        } catch (Exception e) {

        }
        Date d10 = new Date();
        Long d11 = d10.getTime();
        System.out.println(d11 - d1);

    }


}
