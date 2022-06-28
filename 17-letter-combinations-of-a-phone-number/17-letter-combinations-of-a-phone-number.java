class Solution {
    String keys[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits){
        if(digits.length()==0){
           List<String> r=new ArrayList<>();
           return r;
       }
        return letterCombinations2(digits);
    }
    
    public List<String> letterCombinations2(String digits) {
       if(digits.length()==0){
           List<String> r=new ArrayList<>();
           r.add("");
           return r;
       }
        char singleChar=digits.charAt(0);
        int digit=singleChar-'0';
        String strkeys=keys[digit];
        String remString=digits.substring(1);
        List<String> finalResult=new ArrayList<>();
        for(int i=0;i<strkeys.length();i++){
            List<String> result=letterCombinations2(remString);
            for(String s: result){
                finalResult.add(strkeys.charAt(i)+s);
            }
        }
        return finalResult;
    }
}