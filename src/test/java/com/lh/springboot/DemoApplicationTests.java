package com.lh.springboot;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.Duration;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@SpringBootTest
@DisplayName("单元测试")
class DemoApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from users", Long.class);
        System.out.println(aLong);
    }

    @Test
    @DisplayName("测试组合断言方法")
    void test(){
        assertAll("测试组合断言",
                () -> assertEquals(1,1,"assertEquals断言失败"),
                ()->assertTrue(true&true,"assertTrue断言失败"));
    }

    @Test
    @DisplayName("测试数组方法")
    void test1(){
        int[] a = new int[]{1,2,3};
        int[] b = new int[]{1,2,3};
        if (a[0]==4){
            System.out.println("fdsafdsa");
            fail("测试快速失败");

        }

    }

    @Test
    @DisplayName("异常测试")
    public void exceptionTest() {
        ArithmeticException exception = Assertions.assertThrows(
                //扔出断言异常的类型, 需要判断是否有异常的业务
                ArithmeticException.class, () -> System.out.println(1 / 0),"没有产生异常");
    }


    @Test
    @DisplayName("测试前置条件")
    public void timeoutTest1() {

        assumeTrue(false,"不符合前提条件");
        System.out.println("Fdsafdsa");
    }

    @Test
    @Disabled
    @DisplayName("超时测试")
    public void timeoutTest() {
        //如果测试方法时间超过1s将会异常
        Assertions.assertTimeout(Duration.ofMillis(1000), () -> Thread.sleep(500));
    }
    @ParameterizedTest
    @DisplayName("参数化测试")
    @NullSource
    public void timeoutTest5(String i) {
        System.out.println(i);

    }

    @ParameterizedTest
    @DisplayName("参数化测试")
    @MethodSource(value = "method")
    public void timeoutTest2(String i) {
        System.out.println(i);

    }

    static Stream<String> method() {
        return Stream.of("apple", "banana");


    }



}
