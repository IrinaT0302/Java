package UnitTests_HW2;

import org.junit.Assert;
import org.junit.Test;

public class Unit_One {
    @Test
    public void testTask5() {
        Assert.assertArrayEquals(new int[]{3, 4, 1, 2}, HW2.One.runTask5(new int[]{1, 2, 3, 4}));
        Assert.assertArrayEquals(new int[]{7, 8, 5, 6}, HW2.One.runTask5(new int[]{5, 6, 7, 8}));
    }

    @Test
    public void testTask6() {
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, HW2.One.runTask6(new int[]{4, 1, 3, 2, 5}));
    }
}
