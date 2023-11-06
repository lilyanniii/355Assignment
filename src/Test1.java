package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {

    @Test
    public void testAddToTenOnce() {
        int numTimes = 1;  // Add to 10 once
        int expectedResult = 20;  // 10 + 10 = 20
        int result = Test1.calculateResult(numTimes);
        assertEquals(expectedResult, result);
    }

    private static int calculateResult(int numTimes) {
        int result = 10;
        for(int i = 0; i < numTimes; i++) {
            result += 10;
        }
        return result;
    }
}
