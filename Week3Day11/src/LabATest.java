import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.Assert.*;

class LabATest {

    LabA lab;

    @BeforeEach
    void setUp(){
        lab = new LabA();
    }

    @Test
    void testingMakeWriteable(){
        //should make isWriteable false
        lab.makeReadOnly();
        //should make isWriteable true
        lab.makeWritable();
        assertTrue("This should return true", lab.getIsWriteable());
    }

    @Test
    void testingMakeReadable(){
        //should make isWriteable false
        lab.makeReadOnly();
        assertFalse("This should return false", lab.getIsWriteable());
    }

    @Test
    void testingAddOneElement_whenIsWritableIsTrue(){
        int num = 4;
        lab.addOneElement(num);
        int result = lab.vector.elementAt(0);
        assertEquals(4, result );
    }

    @Test
    void testingAddOneElement_whenIsWriteableIsFalse(){
        lab.makeReadOnly();
        int num = 4;
        lab.addOneElement(num);
        assertTrue(lab.vector.isEmpty());
    }

    @Test
    void testingAddManyElements_whenIsWriteableIsTrue(){
        Integer[] array = {1, 2, 3};
        lab.addManyElements(array);
        Vector result = lab.getVector();
//      Not sure where to go from here.
//        assertEquals([1, 2, 3], result);
    }

}