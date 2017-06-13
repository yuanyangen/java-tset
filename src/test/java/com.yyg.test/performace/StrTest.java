package com.yyg.test.performace;

import com.weidian.wdp.common.utils.RequestUtil;
import com.yyg.test.Str;
import com.yyg.test.performance.StrPerfomance;
import org.junit.Test;

import java.util.List;

/**
 * Created by yuanyangen on 17/4/17.
 */
public class StrTest {

    @Test
    public void parseIntTest() {
        StrPerfomance strPerfomance = new StrPerfomance();
        strPerfomance.replaceT();

    }

    @Test
    public void parseInt2Test() {
        StrPerfomance strPerfomance = new StrPerfomance();
        strPerfomance.replaceT2();

    }
}
