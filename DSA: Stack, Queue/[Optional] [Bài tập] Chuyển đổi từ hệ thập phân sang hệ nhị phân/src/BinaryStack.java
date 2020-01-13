import java.util.Stack;
public class BinaryStack {
    public static void main(String[] args) {
        Stack<Integer> b = new Stack();
        int num =35;
        for (int i=0;num==0;i++){
            b.push(num%2);
            num = num/2;
        }
    }
}
