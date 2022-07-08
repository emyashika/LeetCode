class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int cache[][]=new int[m][n];
        return lcsRecursive(text1,text2,m,n,cache);
        
    }
    public int lcsRecursive(String s1, String s2,int m,int n, int cache[][]){
        int count=0;
        if(m==0||n==0){
            return 0;
        }
        if(cache[m-1][n-1]!=0){
            return cache[m-1][n-1];
        }
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            count=1+lcsRecursive(s1, s2, m-1, n-1, cache);
            cache[m-1][n-1]=count;
            return count;
            
        }
        else{
            int x=lcsRecursive(s1, s2, m-1, n,cache);
            int y=lcsRecursive(s1, s2, m, n-1,cache);
            int z= Math.max(x, y);
            cache[m-1][n-1]=z;
            return z;
        }

    }
}