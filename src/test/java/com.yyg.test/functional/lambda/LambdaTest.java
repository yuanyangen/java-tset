package com.yyg.test.functional.lambda;

import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.List;

/**
 * Created by yuanyangen on 6/6/17.
 */
public class LambdaTest {

    @Test
    public void test1() {
        Runnable tt = () -> {
            System.out.println("111111111111");
        };
        tt.run();
    }

    @Test
    public void test2() {
        String[] strArray = {"hello", "world"};
        System.out.println(strArray.toString());

    }
}


