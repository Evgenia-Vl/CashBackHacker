package ru.netology;

public class CashBackHackerTest {

    CashBackHacker service = new CashBackHacker();

    @org.testng.annotations.Test
    public void serviceWorksWhenAmountBetweenZeroAndOneThousand() {
        int amount = 400;
        org.testng.Assert.assertEquals(service.remain(amount), 600);
    }

    @org.testng.annotations.Test
    public void serviceWorksWhenAmountEqualsZero() {
        int amount = 0;
        org.testng.Assert.assertEquals(service.remain(amount), 1000);
    }

    @org.testng.annotations.Test
    public void serviceWorksWhenAmountOverOneThousand() {
        int amount = 1600;
        org.testng.Assert.assertEquals(service.remain(amount), 400);
    }

    @org.testng.annotations.Test
    public void serviceWorksWhenAmountBelowOneThousandInOne() {
        int amount = 999;
        org.testng.Assert.assertEquals(service.remain(amount), 1);
    }

    @org.testng.annotations.Test
    public void serviceWorksWhenAmountOverOneThousandInOne() {
        int amount = 1001;
        org.testng.Assert.assertEquals(service.remain(amount), 999);
    }

    @org.testng.annotations.Test
    public void serviceWorksWhenAmountEqualsOneThousand() {
        int amount = 1000;
        org.testng.Assert.assertEquals(service.remain(amount), 0);
    }

}