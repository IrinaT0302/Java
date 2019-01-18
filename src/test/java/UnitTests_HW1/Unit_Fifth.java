package UnitTests_HW1;

import org.junit.Assert;
import org.junit.Test;

public class Unit_Fifth {
    @Test
    public void testTask4() {
        Assert.assertEquals(321, HW1.Fifth.runTask4(123));
        Assert.assertEquals(789, HW1.Fifth.runTask4(987));
        Assert.assertNotEquals(312, HW1.Fifth.runTask4(123));
    }
}
