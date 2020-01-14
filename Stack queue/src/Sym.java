import java.util.Stack;

public class Sym {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Character[] c = {'(',')','(','(',')',')'};
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ')') {
                stack.pop();
            }else{
                stack.push(c[i]);}
        }
        System.out.println(stack.isEmpty());
    }
}