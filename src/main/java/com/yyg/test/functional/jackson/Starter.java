package com.yyg.test.functional.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weidian.wdp.common.utils.json.JacksonMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

/**
 * Created by yuanyangen on 17/4/26.
 */
public class Starter {
    public static void main(String[] args) {
        String fileName = "/data/titles.text";
        try {
            File fp = new File(fileName);
            if (!fp.exists()) {
                return;
            }
            FileInputStream in = new FileInputStream(fp);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null)   {
			    if (!strLine.contains("tables item_info")) {
                    checkOneLine(strLine);
                }
			}
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void checkOneLine(String oneLine)  {
        ObjectMapper objectMapper = JacksonMapper.getInstance();

        try {
            List<String> obj = objectMapper.readValue(oneLine.getBytes(), List.class);
            String d = Encoder.jsonEncodeWithUnicode(obj);
            if (!d.equals(oneLine)) {
                System.out.println("encode failed " + oneLine + " :ret: " + d);
            }
        } catch (Exception e) {
            System.out.println("json decode  failed: " + oneLine);
        }




    }



}
