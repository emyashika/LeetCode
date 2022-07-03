class Solution {
    public String restoreString(String s, int[] indices) {
       char c[]=s.toCharArray();
       char res[]=new char[c.length];
        StringBuilder r=new StringBuilder()
;       for(int i=0;i<c.length;i++){
            res[indices[i]]=c[i];
        }
        for(char e:res){
            r.append(e);
        }
        return r.toString();
    }
}