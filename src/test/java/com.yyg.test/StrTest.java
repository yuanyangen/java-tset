package com.yyg.test;

import com.weidian.wdp.common.utils.RequestUtil;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanyangen on 17/4/17.
 */
public class StrTest {

    @Test
    public void valueOfStrTest() {
        Str str = new Str();
        str.valueOfStrtoInt();
    }

    @Test
    public void parseIntTest() {
        String url = "https://si.geilicdn.com/bj-pc-971534005-1491544964643-549655779_750_750.jpg";

        url = url.replaceAll("^.{4,5}://.+/", "");

        String str2 = "童年的味道--黄桃罐头\\n会员\\n登录后方可查看VIP等级";
        str2 = str2.replaceAll("\\\\n", "<br>");

        String str1 = " 423543";
        str1 = str1.trim();
        System.out.println(str1);

        Str str = new Str();
        str.parseStrtoInt();

        String i = "1666413454, 1677544372, 1647486484, 671091708, 522743260, 503445566, 488260940, 488257700, 347029896, 245327071";
        List<String> list = RequestUtil.getIdsFromString(i, String.class);

    }


    @Test
    public void testSubString() {
        String a = "43245734254325";
        if (a.length() > 10) {
            a = a.substring(0, 10);
        }

        System.out.println(a);
    }



    @Test
    public void testSubString2() {
        String a = "";
        if (a.length() > 10) {
            a = a.substring(0, 10);
        }

        List<Long> couponIds = new ArrayList<>();
        couponIds.add(1L);
        couponIds.add(2L);
        couponIds.add(3L);


        String ids = StringUtils.join(couponIds.toArray(), ",");

        System.out.println(a);
    }



}
