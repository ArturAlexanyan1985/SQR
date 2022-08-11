package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    public void test() {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();
        int actual = service.calculate(@, &);
        int expected = 3;

        assertEquals(expected, actual);

    }

    @Test
    public void test () {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();
        int actual = service.calculate(200, 200);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void test () {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();
        int actual = service.calculate(300, 200);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void test () {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();
        int actual = service.calculate(0, 1);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void test () {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();
        int actual = service.calculate(0, 10_000);
        int expected = 3;

        assertEquals(expected, actual);
    }
}
