import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    @DisplayName(" Test input 0 output 0")
    void findAbsoluteOf0() {
        int number = 0;
        int expected = 0;
        int result =  (new AbsoluteNumberCalculator()).findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test input 1")
    void testFindAbsolute1(){
        int number = 1;
        int expected = 1;
        int result = (new AbsoluteNumberCalculator()).findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test ")
    void testFindAbsoluteNegative1(){
        int number = -1;
        int expected = 1;
        int result = (new AbsoluteNumberCalculator()).findAbsolute(number);
    }
}
