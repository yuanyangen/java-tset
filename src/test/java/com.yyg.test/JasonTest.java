package com.yyg.test;

import org.junit.Test;

/**
 * Created by yuanyangen on 17/4/15.
 */
public class JasonTest {

    @Test
    public void jacksonPerTest () {
        Json j = new Json();
        String str = "{\"status\":{\"status_code\":0,\"status_reason\":\"\"},\"result\":{\"1151582215\":{\"seller_id\":1120233492,\"price\":\"2.00\",\"item_name\":\"各种水果咯哦哦\",\"img_head\":\"http://wd.geilicdn.com/vshop1120133032-1479882019298-7122002.jpg\",\"status\":1,\"stock\":1697,\"buy_stock\":1697,\"sold\":\"18\",\"is_soldout\":\"0\",\"flag\":\"0\",\"flag_bin\":\"0\",\"extend2\":\"\",\"imgs\":\"[\\\"vshop1120133032-1479882019298-7122002.jpg\\\",\\\"vshop1120133032-1479882023705-3181205.jpg\\\"]\",\"item_comment\":\"各种水果咯哦哦\",\"extend1\":\"{\\\"sup_price\\\":0.01,\\\"sup_id\\\":1120133032,\\\"from\\\":\\\"hzzx\\\"}\",\"service_flag\":null,\"sku\":[{\"item_id\":1151582215,\"title\":\"西瓜 ; S\",\"stock\":1697,\"buy_stock\":0,\"price\":\"2.00\",\"sold\":12,\"sku_merchant_code\":\"\",\"attr_ids\":\"\",\"img\":\"\",\"extend\":\"{\\\"sup_id\\\":1120133032,\\\"sup_price\\\":0.01}\",\"id\":2874290150,\"service_id\":null,\"sup_id\":1120133032,\"sup_price\":0.01,\"csku_id\":0,\"dur_time\":0,\"status\":1},{\"item_id\":1151582215,\"title\":\"橙子 ; S\",\"stock\":0,\"buy_stock\":0,\"price\":\"4.00\",\"sold\":6,\"sku_merchant_code\":\"\",\"attr_ids\":\"\",\"img\":\"\",\"extend\":\"{\\\"sup_id\\\":1120133032,\\\"sup_price\\\":0.02}\",\"id\":2874290151,\"service_id\":null,\"sup_id\":1120133032,\"sup_price\":0.02,\"csku_id\":0,\"dur_time\":0,\"status\":1}],\"id\":\"1151582215\",\"low_price\":\"2.00\",\"high_price\":\"4.00\",\"titles\":\"[\\\"\\\",\\\"\\\"]\",\"is_future_sold\":0,\"future_sold_time\":null,\"is_wzx_sup_item\":0,\"titles_list\":[\"\",\"\"],\"full_imgs\":[\"http://wd.geilicdn.com/vshop1120133032-1479882019298-7122002.jpg\",\"http://wd.geilicdn.com/vshop1120133032-1479882023705-3181205.jpg\"],\"item_detail\":\"\",\"sup_id\":1120133032,\"sup_price\":0.01,\"spu_id\":0,\"is_need_idno\":null,\"add_time\":\"2016-11-23 14:28:46\",\"update_time\":\"2017-03-16 16:06:05\",\"off_shelf_time\":\"1970-01-01 09:00:00\",\"edit_time\":\"2016-12-27 17:10:37\",\"merchant_code\":\"\"}}}";
        j.jacksonPerfomanceTest(str);

    }

    @Test
    public void fastJsonPerTest () {
        Json j = new Json();
        String str = "{\"status\":{\"status_code\":0,\"status_reason\":\"\"},\"result\":{\"1151582215\":{\"seller_id\":1120233492,\"price\":\"2.00\",\"item_name\":\"各种水果咯哦哦\",\"img_head\":\"http://wd.geilicdn.com/vshop1120133032-1479882019298-7122002.jpg\",\"status\":1,\"stock\":1697,\"buy_stock\":1697,\"sold\":\"18\",\"is_soldout\":\"0\",\"flag\":\"0\",\"flag_bin\":\"0\",\"extend2\":\"\",\"imgs\":\"[\\\"vshop1120133032-1479882019298-7122002.jpg\\\",\\\"vshop1120133032-1479882023705-3181205.jpg\\\"]\",\"item_comment\":\"各种水果咯哦哦\",\"extend1\":\"{\\\"sup_price\\\":0.01,\\\"sup_id\\\":1120133032,\\\"from\\\":\\\"hzzx\\\"}\",\"service_flag\":null,\"sku\":[{\"item_id\":1151582215,\"title\":\"西瓜 ; S\",\"stock\":1697,\"buy_stock\":0,\"price\":\"2.00\",\"sold\":12,\"sku_merchant_code\":\"\",\"attr_ids\":\"\",\"img\":\"\",\"extend\":\"{\\\"sup_id\\\":1120133032,\\\"sup_price\\\":0.01}\",\"id\":2874290150,\"service_id\":null,\"sup_id\":1120133032,\"sup_price\":0.01,\"csku_id\":0,\"dur_time\":0,\"status\":1},{\"item_id\":1151582215,\"title\":\"橙子 ; S\",\"stock\":0,\"buy_stock\":0,\"price\":\"4.00\",\"sold\":6,\"sku_merchant_code\":\"\",\"attr_ids\":\"\",\"img\":\"\",\"extend\":\"{\\\"sup_id\\\":1120133032,\\\"sup_price\\\":0.02}\",\"id\":2874290151,\"service_id\":null,\"sup_id\":1120133032,\"sup_price\":0.02,\"csku_id\":0,\"dur_time\":0,\"status\":1}],\"id\":\"1151582215\",\"low_price\":\"2.00\",\"high_price\":\"4.00\",\"titles\":\"[\\\"\\\",\\\"\\\"]\",\"is_future_sold\":0,\"future_sold_time\":null,\"is_wzx_sup_item\":0,\"titles_list\":[\"\",\"\"],\"full_imgs\":[\"http://wd.geilicdn.com/vshop1120133032-1479882019298-7122002.jpg\",\"http://wd.geilicdn.com/vshop1120133032-1479882023705-3181205.jpg\"],\"item_detail\":\"\",\"sup_id\":1120133032,\"sup_price\":0.01,\"spu_id\":0,\"is_need_idno\":null,\"add_time\":\"2016-11-23 14:28:46\",\"update_time\":\"2017-03-16 16:06:05\",\"off_shelf_time\":\"1970-01-01 09:00:00\",\"edit_time\":\"2016-12-27 17:10:37\",\"merchant_code\":\"\"}}}";
        j.fastJsonPerfomanceTest(str);

    }

}
