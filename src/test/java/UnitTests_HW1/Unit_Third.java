package UnitTests_HW1;

import HW1.Third;
import org.junit.Assert;
import org.junit.Test;

public class Unit_Third {

    @Test
    public void TestTicket_moneyToReturn_String() {
        String exp = "аааааа";
        String act = "аааааа";
        Assert.assertEquals(exp, act);
    }

    @Test
    public void TestTicket_moneyToReturn_800() {
        double exp = 800.00;
        double act = Third.moneyToReturn(10);
        Assert.assertEquals(exp, act, 0);
    }

    @Test
    public void TestTicket_moneyToReturn_1000() {
        double exp = 1000.0;
        double act = Third.moneyToReturn(10);
        Assert.assertEquals(exp, act, 0);
    }

    @Test
    public void TestTicket_moneyToReturn_m1() {
        double exp = -1;
        double act = Third.moneyToReturn(10);
        Assert.assertEquals(exp, act, 0);
    }
}
