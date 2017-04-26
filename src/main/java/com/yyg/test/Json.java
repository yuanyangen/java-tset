package com.yyg.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.alibaba.fastjson.JSON;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by yuanyangen on 17/4/15.
 */
public class Json {

    public void jacksonPerfomanceTest (String input) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {

            System.out.println("jackson ");
            Date d = new Date();
            Long cur = d.getTime();
            System.out.println(cur);
            for(int i= 0; i< 1000000; i++) {
                HashMap<String, String> ret = objectMapper.readValue(input.getBytes(), HashMap.class);
            }

            Date dd = new Date();
            Long dest = dd.getTime();
            System.out.println(dest);
            System.out.println(dest - cur);

        } catch (Exception e) {

        }

    }

    public void fastJsonPerfomanceTest (String input) {
        try {
            System.out.println("fast json");
            Date d = new Date();
            Long cur = d.getTime();
            System.out.println(cur);
            for(int i= 0; i< 1000000; i++) {
                HashMap<String, String> ret = JSON.parseObject(input.getBytes(), HashMap.class);
            }

            Date dd = new Date();
            Long dest = dd.getTime();
            System.out.println(dest);
            System.out.println(dest - cur);

        } catch (Exception e) {

        }

    }
}
