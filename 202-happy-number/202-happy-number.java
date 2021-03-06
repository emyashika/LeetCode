class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> s=new HashSet<>();
        while(n!=1){
            int current=n;
            int sum=0;
            while(current!=0){
                sum=sum+(current%10)*(current%10);
                current=current/10;
            }
            if(s.contains(sum)){
                return false;
            }
            s.add(sum);
            n=sum;
        }
        return true;
    }
}