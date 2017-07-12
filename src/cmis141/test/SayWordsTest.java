package cmis141.test;

import cmis141.week3.SayWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by jstok on 7/8/2017.
 */
public class SayWordsTest {

    @Test
    public void sayWordsReturnsSame() {
        SayWords tester = new SayWords();

        assertEquals(tester.sayWords("Hello Moto"), "Hello Moto");
    }

} // end