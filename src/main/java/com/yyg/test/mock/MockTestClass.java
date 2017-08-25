package com.yyg.test.mock;

/**
 * @author yuanyangen
 * @date 7/21/17
 */
public class MockTestClass {

    private MockNormalClass c1 = new MockNormalClass();

     /**
     * 公有静态方法的测试入口
     * @return
     */
    public static String staticFunctionTest() {
        return "public_static";
    }

    /**
     * 公有方法的测试入口
     * @return
     */
    public String publicFunction() {
        return
                //调用私有方法0
                privateFunction0() + " "
                //调用静态方法0
                + staticFunction0() + " "
                //调用对象公有方法
                + c1.publicFunction();
    }

    /**
     * 私有方法测试计划
     * @return
     */
    private String privateFunciton() {
        return "private " + publicFunction();
    }

    /**
     **********************************************************************************************************************************************************
     */
    public static  String staticFunction0() {
        return "public_static0";
    }

    private String privateFunction0() {
        return "private0";
    }

    private String privateFunction1() {
        return "private1 "+ c1.publicFunction();
    }


}
