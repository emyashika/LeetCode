class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum=0;
        int i=0;
        while(i<s.length()){
         char current=s.charAt(i);
         int value=map.get(current);
         int nextValue=0;
         if(i+1<s.length()){
             char next=s.charAt(i+1);
             nextValue=map.get(next);
         }
         if(nextValue>value){
             sum=sum+(nextValue-value);
             i=i+2;
         }
            else{
                sum=sum+value;
                i=i+1;
            }
        }
        return sum;
    }
}
                            