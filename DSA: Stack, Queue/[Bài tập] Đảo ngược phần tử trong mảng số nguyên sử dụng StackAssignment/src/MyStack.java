import java.util.Stack;
public class MyStack {
    public static void main(String[] args) {
        int[] arrPrime = {2, 3, 5, 7, 9, 11, 13};
        String string = "cong hoa xa hoi chu nghia";
        Stack<Integer> prime = new Stack();
        for (int i = 0; i < arrPrime.length; i++) {
            prime.push(arrPrime[i]);
        }
        int[] primeArr = new int[7];
        for (int i = 0; i < arrPrime.length; i++) {
            arrPrime[i]=prime.pop();
        }
        Stack<String> strings = new Stack();
        String[] stringArray = string.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            strings.push(stringArray[i]);
        }
        String[] arrayString = new String[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            arrayString[i]=strings.pop();
        }
    }
}
