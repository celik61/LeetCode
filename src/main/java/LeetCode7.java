public class LeetCode7 {
    //https://leetcode.com/problems/reverse-integer/
    public int reverse(int x) {
        if(x==0) return 0;
        String a="";
        String b="";
        String c="";
        String d="";
        if(x>0){
            a+=x;
            for(int i=a.length()-1; i>=0;i--){
                b+=""+a.charAt(i);
            }
            if(Long.parseLong(b)>Integer.MAX_VALUE){
                return 0;
            }else{
                return Integer.parseInt(b);
            }
        }else{
            c+=x;
            for(int i=c.length()-1; i>0;i--){
                d+=c.charAt(i);
            }
            if(Long.parseLong(d)>Integer.MAX_VALUE){
                return 0;
            }else{
                return -Integer.parseInt(d);
            }
        }
    }

}
