class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int sign=1;
        int index=0;
        int r=0;
        while(index<n && s.charAt(index)==' '){
            index++;
        }
        
        if(index<n && s.charAt(index)=='+'){
            sign=1;
            index++;
        }
        else if(index<n && s.charAt(index)=='-'){
            sign=-1;
            index++;
        }
        
        while(index<n && Character.isDigit(s.charAt(index))){
            int digit=s.charAt(index)-'0';
            if(r>Integer.MAX_VALUE/10 || (r==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10)){
                if(sign==1){
                    return Integer.MAX_VALUE;
                }
                else if(sign==-1){
                    return Integer.MIN_VALUE;
                }
            }
            r=10*r+digit;
            index++;
        }
        return sign*r;
    }

}