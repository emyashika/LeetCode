class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        int j=0;
        int index=0;
        if(n>m){
            return -1;
        }
        for(int i=0;i<m &&j<n;i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                if(j==0){
                    index=i;
                }
                j++;
            }
            else if(index!=-1 && haystack.charAt(i)!=needle.charAt(j) ){
                i=i-j;
                j=0;
                index=0;
        }
        
    }
        return j==needle.length()? index:-1;
}
}