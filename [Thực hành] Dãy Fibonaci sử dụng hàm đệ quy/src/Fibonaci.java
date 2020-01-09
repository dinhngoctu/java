public class Fibonaci {
    public int fibonaci(int num) {
        if (num == Integer.MAX_VALUE || num == Integer.MIN_VALUE || num <= 0) {
            throw new RuntimeException("out of range exception1");
        } else {
            if (num == 2 || num == 1) {
                return 1;
            } else {
                return fibonaci(num - 1) + fibonaci(num - 2);
            }
        }
    }
}

