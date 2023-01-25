package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void testWhenFewSquaresFound () {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testWhereThereAreNoRootsAtTheBottom () {
        SQRService service = new SQRService();

        int actual = service.calc(20, 90);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testWhereMinAndMaxAreEqual () {
        SQRService service = new SQRService();

        int actual = service.calc(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testWhereThereAreNoRootsAtTheTop () {
        SQRService service = new SQRService();

        int actual = service.calc(9900, 10_000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testWhenOneSquaresFound () {
        SQRService service = new SQRService();

        int actual = service.calc(9800, 9900);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testWhereRootIsMinimumWithMaximumValue () {
        SQRService service = new SQRService();

        int actual = service.calc(300, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}