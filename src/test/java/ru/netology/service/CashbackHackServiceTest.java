package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void testFullАmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }


    @org.junit.Test
    public void testBuyCash() {
        CashbackHackService service = new CashbackHackService();
        int amount = 850;
        int actual = service.remain(amount);
        int expected = 150;
        assertEquals(expected, actual);
    }
}