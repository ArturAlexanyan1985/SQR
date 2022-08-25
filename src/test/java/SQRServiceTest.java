package ru.netology.sqr;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @Test
    public void test0() {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();
        int actual = service.calculate(300, 200);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();
        int actual = service.calculate(0, 300);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();
        int actual = service.calculate(0, 3);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();
        int actual = service.calculate(0, 10_000);
        int expected = 3;

        assertEquals(expected, actual);
    }

}
