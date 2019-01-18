package UnitTests_HW1;
import org.junit.Assert;
import org.junit.Test;

public class Unit_First {

    @Test
    public void testTask1(){
        Assert.assertEquals( 2.147483647E9, HW1.First.runTask1(83, 25, 91), 0.1);
        Assert.assertNotEquals(3.147483647E9, HW1.First.runTask1(83, 25, 91), 0.1);
    }
}
