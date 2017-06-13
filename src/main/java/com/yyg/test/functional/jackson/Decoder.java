package com.yyg.test.functional.jackson;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.weidian.wdp.common.utils.json.JacksonMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yuanyangen on 17/4/26.
 */
public class Decoder {
    /**
     * json_encode中文为unicode
     * @return
     * @throws Exception
     */
    public void jsonDecodere() {
        ObjectMapper objectMapper = JacksonMapper.getInstance();
        //当找不到对应的序列化器时 忽略此字段
        String a = "{\"ids\":{\"2068849387\":{\"item_id\":2068849387,\"sku_ids\":[0]},\"2091367269\":{\"item_id\":2091367269,\"sku_ids\":[0]}},"
                + "\"return_array\":false}";
        //String a = "{\"ids\":[{\"item_id\":\"2083235342\",\"sku_ids\":[\"6272057122\"]}],\"return_array\":\"true\"}";
        try {
            Map ret = objectMapper.readValue(a.getBytes(), HashMap.class);
            Object b = ret.get("ids");
            List<Object> itemIds =  new ArrayList<Object>();
            if (b.getClass() == ArrayList.class) {
                ArrayList tmp = (ArrayList) b;
                for (Object obj : tmp) {
                    Map tmpmap = (Map<String, Object>) obj;
                    itemIds.add(tmpmap.get("item_id"));
                }
            } else if (b.getClass() == LinkedHashMap.class) {
                LinkedHashMap<String, Object> tmp = (LinkedHashMap) b;
                for (Object obj : ((LinkedHashMap) b).values()) {
                    Map tmpmap = (Map<String, Object>) obj;
                    itemIds.add(tmpmap.get("item_id"));
                }
            }
            System.out.println(itemIds);
        } catch (Exception e) {

        }
    }

    public void jsonDecodField() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String a = "{\"id\":\"2083235342\",\"ids\":null,\"sku_ids\":\"1214432\"}";
        try {
            TestA ret = objectMapper.readValue(a, TestA.class);
            System.out.println(ret);
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    static class TestA {
        private Long id;
        private List<Long> ids = new ArrayList<Long>();

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public List<Long> getIds() {
            return ids;
        }

        public void setIds(List<Long> ids) {
            this.ids = ids;
        }
    }



}
