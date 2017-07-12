package cmis141.test;

import org.junit.jupiter.api.Test;

import static cmis141.week3.MathDemo.mathDemo;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Created by 590905 on 7/7/2017.
 */
public class MathDemoTest {
    @Test
    public void mathDemoTest() throws Exception {
        //mathDemo(35.0, -35);
        assertNotNull(mathDemo(35, -35));
        //assertEquals(-35,mathDemo(35,-35));

    }

}