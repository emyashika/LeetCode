class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char singleChar=s.charAt(i);
            if(map.containsKey(singleChar)){
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char topValue=stack.pop();
                    if(map.get(singleChar)!=topValue){
                        return false;
                    }
                }
            }
            else{
                stack.push(singleChar);
            }
        }
        return stack.isEmpty();
    }
}