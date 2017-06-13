package com.yyg.test.performance;

import com.vdian.vitamin.client.VitaminClient;

/**
 * Created by yuanyangen on 17/5/3.
 */
public class Vitamin {
    public void lookUpTest() {
        String resp = VitaminClient.lookup("wd-item", "common", "flag_infos");
    }

}
