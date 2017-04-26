package com.yyg.test;

import java.util.Date;

/**
 * Created by yuanyangen on 17/4/17.
 */
public class Str {
    public void replaceT() {
        String str = "http://si.geilicdn.com/bj-pc-278187899-1490318139773-508378918.jpg?w=1080&h=1059";
        System.out.println(str.replaceAll("^http.*://.+/", ""));
    }


    public void valueOfStrtoInt() {
        String str = "365547645";
        System.out.println("value of");
        Date d = new Date();
        Long cur = d.getTime();

        for (int i=0; i<10000000; i++) {
            Integer in = Integer.valueOf(str);
        }
        Date dd = new Date();
        Long dest = dd.getTime();
        System.out.println(dest);
        System.out.println(dest - cur);

    }

    public void parseStrtoInt() {
        String str = "365547645";
        System.out.println("parse int ");
        Date d = new Date();
        Long cur = d.getTime();

        for (int i=0; i<10000000; i++) {
            Integer in = Integer.parseInt(str);
        }
        Date dd = new Date();
        Long dest = dd.getTime();
        System.out.println(dest);
        System.out.println(dest - cur);

    }
}
