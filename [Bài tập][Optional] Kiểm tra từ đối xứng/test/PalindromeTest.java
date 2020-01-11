import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @org.junit.jupiter.api.Test
    void isPalindrome() {
        String s = "xnnnx";
        int length = 5;
        boolean expected = true;
        boolean result = Palindrome.isPalindrome(s,length);
        assertEquals(expected,result);
    }
}