package lt.vtmc.ks;

import org.junit.jupiter.api.*;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    MathUtils mathUtils;

//   @BeforeAll and @AfterAll runs before his class instance is created,
//   so they MUST be static.
    @BeforeAll
    static void greet(){
        System.out.println("Tests sequence started");
    }
    @AfterAll
    static void bye(){
        System.out.println("Tests sequence ended");
    }

    @BeforeEach
    void init(){
         this.mathUtils = new MathUtils();
    }
    @AfterEach
    void cleanUp(){
        System.out.println("Cleaning Up...");
    }


    @Test
    void testAdd() {
        // fail("Not yet implemented");

        int expected = 2;
        int actual = this.mathUtils.add(1, 1);
        assertEquals(expected, actual);

    }

    @Test
    void testComputeCircleArea() {

        assertEquals(Math.PI * 10*10, this.mathUtils.computeCircleArea(10),"Should return circle area.");
        assertThrows(IllegalArgumentException.class, ()->mathUtils.computeCircleArea(-1));
    }

    @Test
    void testDivide() {

       assertThrows(RuntimeException.class, ()-> this.mathUtils.divide(1,0));
//       assertThrows(ArithmeticException.class, ()-> mathUtils.divide(1,0));


    }
}