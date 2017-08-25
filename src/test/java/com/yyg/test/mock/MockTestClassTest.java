package com.yyg.test.mock;

import com.weidian.wdp.common.utils.ReflectUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Method;

import static org.mockito.Mockito.*;

/**
 * @author yuanyangen
 * @date 8/25/17
 */
class MockTestClassTest {
    @Mock
    MockNormalClass c1;
    @InjectMocks
    MockTestClass mockTestClass;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testStaticFunctionTest() {
        String result = MockTestClass.staticFunctionTest();
        Assertions.assertEquals("public_static", result);
    }

    @Test
    @DisplayName("测试公有方法")
    void testPublicFunction() {

        when(c1.publicFunction()).thenReturn("mocked_data");
        String result = mockTestClass.publicFunction();

        //with mock
        Assertions.assertEquals("private0 public_static0 mocked_data", result);
        verify(c1).publicFunction();

        //without Mock
        //Assertions.assertEquals("private0 public_static0 public_normal", result);
    }

    @Test
    @DisplayName("测试静态方法")
    void testStaticFunction0() {
        String result = MockTestClass.staticFunction0();
        Assertions.assertEquals("public_static0", result);
    }

    @Test
    @DisplayName("测试私有方法1")
    void testPrivateFunction0() {

        when(c1.publicFunction()).thenReturn("mocked_data");
        try {
            Method method = mockTestClass.getClass().getDeclaredMethod("privateFunction1");
            method.setAccessible(true);
            String result = (String) method.invoke(mockTestClass);

            //with mock
            Assertions.assertEquals("private1 mocked_data", result);
            verify(c1).publicFunction();

            //without Mock
            //Assertions.assertEquals("private0 public_static0 public_normal", result);
        } catch (Exception e) {
            e.printStackTrace();
        }
   }

    @Test
    @DisplayName("测试私有方法2")
    void testPrivateFunction1() {

        when(c1.publicFunction()).thenReturn("mocked_data");
        try {
            String result = ReflectUtil.callFunction(mockTestClass, "privateFunction1");

            Assertions.assertEquals("private1 mocked_data", result);
            verify(c1).publicFunction();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //without Mock
        //Assertions.assertEquals("private0 public_static0 public_normal", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme