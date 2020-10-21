import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CrunchNumbersTest {

    CrunchNumbers crunch;

    @BeforeEach
    void setUp(){
        crunch = new CrunchNumbers();
    }

    @Test
    void testTriangleArea(){
        assertEquals(12, crunch.findArea(6,4));
    }

}
