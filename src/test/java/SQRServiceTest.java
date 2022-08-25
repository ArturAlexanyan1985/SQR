import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void test0() {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();
        int actual = service.calculate(300, 200);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();
        int actual = service.calculate(0, 300);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();
        int actual = service.calculate(0, 3);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();
        int actual = service.calculate(0, 10_000);
        int expected = 90;

        assertEquals(expected, actual);
    }

}
