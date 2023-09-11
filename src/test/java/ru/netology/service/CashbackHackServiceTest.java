package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
 public void testFullАmount() {
        CashbackHackService service = new CashbackHackService ();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals (actual,expected);
    }
    @org.testng.annotations.Test
    public void testBuyCash() {
        CashbackHackService service = new CashbackHackService ();
        int amount = 850;
        int actual = service.remain(amount);
        int expected = 150;
        assertEquals (actual,expected);
    }
}