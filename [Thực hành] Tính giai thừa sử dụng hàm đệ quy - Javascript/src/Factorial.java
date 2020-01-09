public class Factorial {
    public int calculateFactorial(int number) {
        if (number < 0||number==Integer.MAX_VALUE) {
            throw new UnsupportedOperationException("nhap sai gia tri");
        } else {
            if (number == 1 || number == 0) {
                return 1;
            } else {
                return number * calculateFactorial(number - 1);
            }
        }
    }
}
