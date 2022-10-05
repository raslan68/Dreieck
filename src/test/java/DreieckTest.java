import dreieck.Dreieck;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DreieckTest {

    private Dreieck dreieck;

    @BeforeEach
    void set_up(){
        dreieck = new Dreieck();
    }

    @Test
    void unregelmäßiges_dreieck(){
        String actual = dreieck.calculate(3,5,7);
        String expected = "unregelmäßiges Dreieck";

        assertEquals(expected, actual);
    }

    @Test
    void gleichseitiges_dreieck(){
        String actual = dreieck.calculate(8,8,8);
        String expected = "Gleichseitiges Dreieck";

        assertEquals(expected, actual);
    }

    @Test
    void gleichschenkliges_dreieck(){
        String actual = dreieck.calculate(1,1,2);
        String expected = "Gleichschenkliges Dreieck";

        assertEquals(expected, actual);
    }

    @Test
    void kein_dreieck_mit_a(){
        String actual = dreieck.calculate(122,12,12);
        String expected = "Kein Dreieck. Die eingegebenen Zahlen müssen zwischen 1 und 99 liegen.";

        assertEquals(expected, actual);
        assertNotEquals(actual, expected);
    }

    @Test
    void kein_dreieck_mit_b(){
        String actual = dreieck.calculate(12,122,12);
        String expected = "Kein Dreieck. Die eingegebenen Zahlen müssen zwischen 1 und 99 liegen.";

        assertEquals(expected, actual);
    }

    @Test
    void kein_dreieck_mit_c(){
        String actual = dreieck.calculate(12,12,122);
        String expected = "Leider das ist kein Dreieck. Die eingegebenen Zahlen müssen zwischen 1 und 99 liegen.";

        assertEquals(expected, actual);
    }

}
