package UnitTests_HW1;

import org.junit.Assert;
import org.junit.Test;

public class Unit_Fourth {

    @Test
    public void testTask3() {
        Assert.assertEquals(120, HW1.Fourth.runTask3(5));
        Assert.assertNotEquals(110, HW1.Fourth.runTask3(5));

        Assert.assertEquals(24, HW1.Fourth.runTask3(4));
        Assert.assertNotEquals(110, HW1.Fourth.runTask3(4));
    }
}
