import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {


    @Test
    void checkTriangleTest() {
        int sideA = 2;
        int sideB = 3;
        int sideC = 2;
        boolean expect = true;
        boolean result = false;
        String[] arr = {"tam giác đều", "tam giác cân", "tam giác thường", "không phải là tam giác"};
        TriangleClassifier triangle = new TriangleClassifier();
        String[] triangleName = new String[1];
        triangleName[0] = triangle.checkTriangle(sideA, sideB, sideC);
        for (String element : arr) {
            if (element == triangleName[0]) {
                result = true;
            }
        }
        assertEquals(expect, result);
    }
}