class Solution {
    public int[] plusOne(int[] digits) {
        
        int i=digits.length-1;
        int carry=1;
        while(i>=0){
                int temp=digits[i]+carry;
                carry=temp/10;
                digits[i]=temp%10;  
            i--;
        }
        if(carry==1){
            int output[]=new int[digits.length+1];
            output[0]=carry;
            for(int j=1;j<digits.length;j++){
                output[j]=digits[j];
            }
            return output;
        }
        return digits;
    }
}