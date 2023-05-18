package ru.netology;


public class CashBackHackerTest {

    CashBackHacker service = new CashBackHacker();

    @org.junit.Test
    public void serviceWorksWhenAmountBetweenZeroAndOneThousand1() {
        int amount = 400;
        org.junit.Assert.assertEquals(600, service.remain(amount));
    }

    @org.junit.Test
    public void serviceWorksWhenAmountEqualsZero1() {
        int amount = 0;
        org.junit.Assert.assertEquals(1000, service.remain(amount));
    }

    @org.junit.Test
    public void serviceWorksWhenAmountOverOneThousand1() {
        int amount = 1600;
        org.junit.Assert.assertEquals(400, service.remain(amount));
    }

    @org.junit.Test
    public void serviceWorksWhenAmountBelowOneThousandInOne1() {
        int amount = 999;
        org.junit.Assert.assertEquals(1, service.remain(amount));
    }

    @org.junit.Test
    public void serviceWorksWhenAmountOverOneThousandInOne1() {
        int amount = 1001;
        org.junit.Assert.assertEquals(999, service.remain(amount));
    }

    @org.junit.Test
    public void serviceWorksWhenAmountEqualsOneThousand1() {
        int amount = 1000;
        org.junit.Assert.assertEquals(0, service.remain(amount));
    }

    @org.junit.jupiter.api.Test
    public void serviceWorksWhenAmountBetweenZeroAndOneThousand2() {
        int amount = 400;
        org.junit.jupiter.api.Assertions.assertEquals(600, service.remain(amount));
    }

    @org.junit.jupiter.api.Test
    public void serviceWorksWhenAmountEqualsZero2() {
        int amount = 0;
        org.junit.jupiter.api.Assertions.assertEquals(1000, service.remain(amount));
    }

    @org.junit.jupiter.api.Test
    public void serviceWorksWhenAmountOverOneThousand2() {
        int amount = 1600;
        org.junit.jupiter.api.Assertions.assertEquals(400, service.remain(amount));
    }

    @org.junit.jupiter.api.Test
    public void serviceWorksWhenAmountBelowOneThousandInOne2() {
        int amount = 999;
        org.junit.jupiter.api.Assertions.assertEquals(1, service.remain(amount));
    }

    @org.junit.jupiter.api.Test
    public void serviceWorksWhenAmountOverOneThousandInOne2() {
        int amount = 1001;
        org.junit.jupiter.api.Assertions.assertEquals(999, service.remain(amount));
    }

    @org.junit.jupiter.api.Test
    public void serviceWorksWhenAmountEqualsOneThousand2() {
        int amount = 1000;
        org.junit.jupiter.api.Assertions.assertEquals(0, service.remain(amount));
    }
}