class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=0;
        int hashset[]=new int[128];
        while(j<s.length()){
            char singleChar=s.charAt(j);
            hashset[singleChar]++;
            while(hashset[singleChar]>1){
                char leftChar=s.charAt(i);
                hashset[leftChar]--;
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}