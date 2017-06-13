package com.yyg.test.functional.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.weidian.wdp.common.utils.json.JacksonMapper;

/**
 * Created by yuanyangen on 17/4/26.
 */
public class Encoder {
    /**
     * json_encode中文为unicode
     * @param input
     * @return
     * @throws Exception
     */
    public static String jsonEncodeWithUnicode(Object input) throws Exception {
        ObjectMapper objectMapper = JacksonMapper.getInstance();
        //当找不到对应的序列化器时 忽略此字段
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        //使Jackson JSON支持Unicode编码非ASCII字符
        SimpleModule module = new SimpleModule();
        module.addSerializer(String.class, new UnicodeSerializer());
        objectMapper.registerModule(module);
        return objectMapper.writeValueAsString(input);
    }



}
