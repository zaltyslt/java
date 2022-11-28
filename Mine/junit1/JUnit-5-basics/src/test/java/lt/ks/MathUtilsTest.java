package lt.ks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class MathUtilsTest extends Object {

    @Test
    void test() {
   // Reikia pakurti testuojamos klases objekta
        MathUtils mathUtils = new MathUtils();
        //
        int expectedResult = 2;
        int actualResult = mathUtils.add(1,1);
        assertEquals(expectedResult, actualResult);
    }
}