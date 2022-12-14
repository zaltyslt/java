package lt.vtmc.ks;

import org.junit.jupiter.api.*;

import java.lang.reflect.Executable;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class MathUtilsTest {
    MathUtils mathUtils;

    //   @BeforeAll and @AfterAll runs before his class instance is created,
//   so they MUST be static.
    @BeforeAll
    static void greet() {
        System.out.println("Tests sequence started");
    }

    @AfterAll
    static void bye() {
        System.out.println("Tests sequence ended");
    }

    @BeforeEach
    void init() {
        this.mathUtils = new MathUtils();
    }

    @AfterEach
    void cleanUp() {
        System.out.println("Cleaning Up...");
    }
    @Nested
    @DisplayName("Test add method")
    class AddTest {
        @Test
        @DisplayName("Test subtract method")
        void testSubtract(){
        assumeTrue(mathUtils.subtract( 1,2) <0);
        }
        @Test
        @DisplayName("Test add + numbers")
        void testAddPositiveNumbers() {

            assertEquals(2, mathUtils.add(1, 1), ()->"Expected " + 2 + " but got " + mathUtils.add(1, 1));
        }

        @Test
        @DisplayName("Test add - numbers")
        void testAddNegativeNumbers() {
            assertEquals(-2, mathUtils.add(-1, -1));
        }
    }

    @Test
    void testComputeCircleArea() {

        assertEquals(Math.PI * 10 * 10, this.mathUtils.computeCircleArea(10), "Should return circle area.");

        assertThrows(IllegalArgumentException.class, () -> mathUtils.computeCircleArea(-1));
    }

    @Test
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0));
    }

    @Test
    @DisplayName("Test multiply method with bunch of asserts")
    void testMultiply() {
        assertAll(
                () -> assertEquals(4, mathUtils.multiply(2, 2), "Should return possitive number"),
                () -> assertEquals(0, mathUtils.multiply(2, 0), "Should return 0"),
                () -> assertEquals(-4, mathUtils.multiply(-2, 2), "Should return negative number")
        );
    }
}