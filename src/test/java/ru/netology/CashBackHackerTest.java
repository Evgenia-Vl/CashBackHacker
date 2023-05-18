package ru.netology;

import static org.junit.Assert.*;

public class CashBackHackerTest {

    CashBackHacker service = new CashBackHacker();
    @org.junit.Test
    public void serviceWorksWhenAmountBetweenZeroAndOneThousand() {
        int amount = 400;
        org.junit.Assert.assertEquals(600, service.remain(amount));
    }

    @org.junit.Test
    public void serviceWorksWhenAmountEqualsZero() {
        int amount = 0;
        org.junit.Assert.assertEquals(1000, service.remain(amount));
    }

    @org.junit.Test
    public void serviceWorksWhenAmountOverOneThousand() {
        int amount = 1600;
        org.junit.Assert.assertEquals(400, service.remain(amount));
    }

    @org.junit.Test
    public void serviceWorksWhenAmountBelowOneThousandInOne() {
        int amount = 999;
        org.junit.Assert.assertEquals(1, service.remain(amount));
    }

    @org.junit.Test
    public void serviceWorksWhenAmountOverOneThousandInOne() {
        int amount = 1001;
        org.junit.Assert.assertEquals(999, service.remain(amount));
    }

    @org.junit.Test
    public void serviceWorksWhenAmountEqualsOneThousand() {
        int amount = 1000;
        org.junit.Assert.assertEquals(0, service.remain(amount));
    }
}