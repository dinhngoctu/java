import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    @DisplayName("Testing getArea(0, 0)")
    void testGetArea0And0() {
        int radius = 0;
        int height = 0;
        double expected = 0;

        double result = Cylinder.getArea(radius, height);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing getArea(1, 2)")
    void testGetArea1And2() {
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;

        double result = Cylinder.getArea(radius, height);
        assertEquals(expected, result);
    }
}