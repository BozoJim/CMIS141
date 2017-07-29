package cmis141.test;

import cmis141.week6.Fan1;
import org.junit.jupiter.api.Test;


class Fan1Test {

    private Fan1 defaultFan = new Fan1();
    private Fan1 secondFan = new Fan1(11, false, 3.29, "blue");

    @Test
    void testDefault() {
        System.out.println("defaultFan:");
        System.out.println(defaultFan.toString());
    }

    @Test
    void testSecond() {
        System.out.println("secondFan");
        System.out.println(secondFan.toString());
    }

}