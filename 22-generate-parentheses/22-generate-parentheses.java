class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        int open=0;
        int close=0;
        generateParenthesisLogic(n,open,close,result,"");
        return result;
    }
    void generateParenthesisLogic(int n,int open,int close, List<String> result, String brackets){
        
        if(brackets.length()==n*2){
            result.add(brackets);
            return;
        }
        if(open<n){
            generateParenthesisLogic(n,open+1,close,result,brackets+"(");
        }
        if(close<open){
            generateParenthesisLogic(n,open,close+1,result,brackets+")");
        }
        
    }
}