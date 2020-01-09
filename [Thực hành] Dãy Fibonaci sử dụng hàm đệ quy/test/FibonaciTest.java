import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonaciTest {
    @Test
    void fibonaci() {
        int num = 0;
        int expect =1;
        Fibonaci fibonaci = new Fibonaci();
        int result = fibonaci.fibonaci(num);
        assertEquals(expect,result);
    }
}