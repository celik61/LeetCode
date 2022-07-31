public class LeetCode9 {
    //https://leetcode.com/problems/palindrome-number/
    public boolean isPalindrome(int x) {
        String a= ""+x;
        String b="";

        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }

        return a.equals(b);

    }

}
