package cmis141.test;

import cmis141.week4.DeliveryFee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeliveryFeeTest {

    @Test
    public void test() {
        DeliveryFee testCase = new DeliveryFee(8.8, 3);
        assertEquals(8.8, testCase.getFuel(), 0.001);
        assertEquals(3.0, testCase.getDistance(), 0.001);
        assertEquals(26.4, testCase.cost(), 0.001);
        System.out.println(testCase.toString());
    }
} // end DeliveryFeeTest