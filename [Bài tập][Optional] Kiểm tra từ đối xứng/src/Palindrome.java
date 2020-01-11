public class Palindrome {
    public static boolean isPalindrome(String s,int length){
        length=s.length();
        length-=1;
        if(length==s.length()/2-1){return true;}
       if(s.charAt(length)==s.charAt(0)){
           return isPalindrome(s,length-1);
       }else{
           return false;
       }
    }
}
