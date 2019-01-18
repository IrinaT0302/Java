package UnitTests_HW2;

import org.junit.Assert;
import org.junit.Test;

public class Unit_Two {
    @Test
    public void testTask7() {
        Assert.assertEquals("58", HW2.Two.runTask7(58));
        Assert.assertNotEquals("59", HW2.Two.runTask7(58));
    }

    @Test
    public void testTask8() {
        Assert.assertEquals("85.495", HW2.Two.runTask8(85.495d));
        Assert.assertNotEquals("59", HW2.Two.runTask8(85.495d));
    }
    @Test
    public void testTask9() {
        Assert.assertEquals(64, HW2.Two.runTask9("64"));
        Assert.assertNotEquals(65, HW2.Two.runTask9("64"));
    }
    @Test
    public void testTask10() {
        Assert.assertEquals(52.2845d, HW2.Two.runTask10("52.2845"), 0.1);
        Assert.assertNotEquals(55.2845d, HW2.Two.runTask10("52.2845"));
    }
    @Test
    public void testTask11() {
        Assert.assertEquals(3, HW2.Two.runTask11("Один два три четыре пять"));
        Assert.assertNotEquals(5, HW2.Two.runTask11("Один два три четыре пять"));
    }
    @Test
    public void testTask12() {
        Assert.assertEquals(5, HW2.Two.runTask12("Один два три четыре пять"));
        Assert.assertNotEquals(2, HW2.Two.runTask12("Один два три четыре пять"));
    }
    @Test
    public void testTask14() {
        Assert.assertEquals("Один два три четыре", HW2.Two.runTask14("Один два три четыре пять"));
        Assert.assertNotEquals("Один два три четыре пять", HW2.Two.runTask14("Один два три четыре пять"));
    }
}
