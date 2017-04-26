package com.yyg.test;

import com.weidian.wdp.common.utils.BeanCopyUtils;
import com.weidian.wdp.slf4j.Logger;
import com.weidian.wdp.slf4j.LoggerFactory;
import org.apache.commons.beanutils.PropertyUtils;

import java.util.Date;

/**
 * Created by yuanyangen on 17/4/17.
 */
public class Copy {
    private Logger logger = LoggerFactory.getLogger(Copy.class);

    public void beatCopySpring() {
        TestType0 obj0 =  new TestType0();
        obj0.setFiled0("0");
        obj0.setFiled1("1");
        obj0.setFiled2("2");
        obj0.setFiled3("3");
        obj0.setFiled4("4");
        obj0.setFiled5("5");
        obj0.setFiled6("6");
        obj0.setFiled7("7");
        obj0.setFiled8("8");
        obj0.setFiled9("9");
        logger.error("fffdghd");


        TestType1 obj1 = new TestType1();

        Date d = new Date();
        Long d1 = d.getTime();
        try {
            for (int i = 0; i< 10000; i++) {
                PropertyUtils.copyProperties(obj1, obj0);
            }

        } catch (Exception e) {

        }
         Date d10 = new Date();
        Long d11 = d10.getTime();
        System.out.println(d11 - d1);
    }

    public void beatCopyWdp() {
        TestType0 obj0 =  new TestType0();
        TestType1 obj1 = new TestType1();
        obj0.setFiled0("0");
        obj0.setFiled1("1");
        obj0.setFiled2("2");
        obj0.setFiled3("3");
        obj0.setFiled4("4");
        obj0.setFiled5("5");
        obj0.setFiled6("6");
        obj0.setFiled7("7");
        obj0.setFiled8("8");
        obj0.setFiled9("9");


        Date d = new Date();
        Long d1 = d.getTime();
        try {
            for (int i = 0; i< 10000; i++) {
                BeanCopyUtils.copyProperties(obj1, obj0);

            }

        } catch (Exception e) {

        }
         Date d10 = new Date();
        Long d11 = d10.getTime();
        System.out.println(d11 - d1);
    }




    public void beatCopySet() {
        TestType0 obj0 =  new TestType0();
        TestType1 obj1 = new TestType1();
        obj0.setFiled0("0");
        obj0.setFiled1("1");
        obj0.setFiled2("2");
        obj0.setFiled3("3");
        obj0.setFiled4("4");
        obj0.setFiled5("5");
        obj0.setFiled6("6");
        obj0.setFiled7("7");
        obj0.setFiled8("8");
        obj0.setFiled9("9");


        Date d = new Date();
        Long d1 = d.getTime();
        try {
            for (int i = 0; i< 10000; i++) {
                obj1.setFiled0(obj0.getFiled0());
                obj1.setFiled1(obj0.getFiled1());
                obj1.setFiled2(obj0.getFiled2());
                obj1.setFiled3(obj0.getFiled3());
                obj1.setFiled4(obj0.getFiled4());
                obj1.setFiled5(obj0.getFiled5());
                obj1.setFiled6(obj0.getFiled6());
                obj1.setFiled7(obj0.getFiled7());
                obj1.setFiled8(obj0.getFiled8());
                obj1.setFiled9(obj0.getFiled9());

            }

        } catch (Exception e) {

        }
         Date d10 = new Date();
        Long d11 = d10.getTime();
        System.out.println(d11 - d1);
    }




    class TestType0 {
        String filed1;
        String filed2;
        String filed3;
        String filed4;
        String filed5;
        String filed6;
        String filed7;
        String filed8;
        String filed9;
        String filed0;

        public String getFiled1() {
            return filed1;
        }

        public void setFiled1(String filed1) {
            this.filed1 = filed1;
        }

        public String getFiled2() {
            return filed2;
        }

        public void setFiled2(String filed2) {
            this.filed2 = filed2;
        }

        public String getFiled3() {
            return filed3;
        }

        public void setFiled3(String filed3) {
            this.filed3 = filed3;
        }

        public String getFiled4() {
            return filed4;
        }

        public void setFiled4(String filed4) {
            this.filed4 = filed4;
        }

        public String getFiled5() {
            return filed5;
        }

        public void setFiled5(String filed5) {
            this.filed5 = filed5;
        }

        public String getFiled6() {
            return filed6;
        }

        public void setFiled6(String filed6) {
            this.filed6 = filed6;
        }

        public String getFiled7() {
            return filed7;
        }

        public void setFiled7(String filed7) {
            this.filed7 = filed7;
        }

        public String getFiled8() {
            return filed8;
        }

        public void setFiled8(String filed8) {
            this.filed8 = filed8;
        }

        public String getFiled9() {
            return filed9;
        }

        public void setFiled9(String filed9) {
            this.filed9 = filed9;
        }

        public String getFiled0() {
            return filed0;
        }

        public void setFiled0(String filed0) {
            this.filed0 = filed0;
        }
    }





    class TestType1 {
        String filed1;
        String filed2;
        String filed3;
        String filed4;
        String filed5;
        String filed6;
        String filed7;
        String filed8;
        String filed9;
        String filed0;

        public String getFiled1() {
            return filed1;
        }

        public void setFiled1(String filed1) {
            this.filed1 = filed1;
        }

        public String getFiled2() {
            return filed2;
        }

        public void setFiled2(String filed2) {
            this.filed2 = filed2;
        }

        public String getFiled3() {
            return filed3;
        }

        public void setFiled3(String filed3) {
            this.filed3 = filed3;
        }

        public String getFiled4() {
            return filed4;
        }

        public void setFiled4(String filed4) {
            this.filed4 = filed4;
        }

        public String getFiled5() {
            return filed5;
        }

        public void setFiled5(String filed5) {
            this.filed5 = filed5;
        }

        public String getFiled6() {
            return filed6;
        }

        public void setFiled6(String filed6) {
            this.filed6 = filed6;
        }

        public String getFiled7() {
            return filed7;
        }

        public void setFiled7(String filed7) {
            this.filed7 = filed7;
        }

        public String getFiled8() {
            return filed8;
        }

        public void setFiled8(String filed8) {
            this.filed8 = filed8;
        }

        public String getFiled9() {
            return filed9;
        }

        public void setFiled9(String filed9) {
            this.filed9 = filed9;
        }

        public String getFiled0() {
            return filed0;
        }

        public void setFiled0(String filed0) {
            this.filed0 = filed0;
        }
    }



}
