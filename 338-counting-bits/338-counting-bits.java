class Solution {
    public int[] countBits(int n) {
        int res[]=new int[n+1];
        for(int i=0;i<n+1;i++)
            
        {
            if(i%2==0)
            {
                res[i]=res[i/2];
            }
            else{
                res[i]=res[i/2]+1;
            }
        }
        return res;
    }
}