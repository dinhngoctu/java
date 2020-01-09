import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @org.junit.jupiter.api.Test
    void calculateFactorial() {
        int number =Integer.MIN_VALUE;
        int expected=1;
        Factorial factorial = new Factorial();
        int result = factorial.calculateFactorial(number);
        assertEquals(expected,result);
    }
}