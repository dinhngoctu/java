public class TriangleClassifier {
    public String checkTriangle(int sideA, int sideB, int sideC) {
        String result;

        if ((sideA > 0 && sideB > 0 && sideC > 0) && ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideC + sideB > sideA))) {
            result = "tam giác thường";
            if (sideA == sideB || sideB == sideC || sideA == sideC) {
                result = "tam giác cân";
                if (sideA == sideB && sideB == sideC) {
                    result = "tam giác đều";
                }
            } else {
                result = "không phải là tam giác";
            }
        } else {
            result = "không phải là tam giác";
        }

        return result;
    }
}

