import java.util.Comparator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "Able was I ere I saw Elba";
        Stack<Character> stack = new Stack();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            ((LinkedList<Character>) queue).push(s.charAt(i));
        }
        int j =0;
        for (int i = 0; i < s.length(); i++) {
            if (!(stack.get(i)==((LinkedList<Character>) queue).get(i))) { j=1;
            }
        }
        System.out.println(j);
    }
}

