class Solution {
    public int reverse(int x) {
        int sign;
        double rev=0;
        if(x<0){
            sign=-1;
        }
        else{
            sign=1;
        }
        x=Math.abs(x);
        while(x>0){
            double digit=x%10;
            rev=rev*10+digit;
            if(rev>=Integer.MAX_VALUE || rev<=Integer.MIN_VALUE ) 
                return 0;
            x=x/10;
        }
    
        return (int)rev*sign;
    }
}