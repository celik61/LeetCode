public class LeetCode371 {
    //https://leetcode.com/problems/sum-of-two-integers/
    public int getSum(int a, int b) {
        while(b!=0){
            int temp=(a&b)<<1;
            a= a^b;
            b=temp;
        }
        return a;
    }
}
