class Solution {
    
    boolean canPlace(boolean board[][],int currentRow,int col){
        //same col
        for(int i=col;i>=0;i--){
            if(board[currentRow][i]){
                return false;
            }
        }

        //same row
        for(int i=currentRow;i>=0;i--){
            if(board[i][col]){
                return false;
            }
        }

        //upper left diagonal
        for(int i=currentRow,j=col;i>=0 &&j>=0;i--,j--){
            if(board[i][j]){
                return false;
            }
        }

        //upper right diagonal
        for(int i=currentRow,j=col;i>=0 &&j<board.length;i--,j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;

    }
    void add(boolean board[][],List<List<String>>ans){
        List<String> list=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            StringBuilder str=new StringBuilder();
            for(int j=0;j<board.length;j++){
                if(board[i][j]){
                    str.append("Q");
                }
                else{
                    str.append(".");
                }
            }
            list.add(str.toString());
        }
        ans.add(list);
    }
    void solve(boolean board[][],List<List<String>>ans,int currentRow){
        if(currentRow==board.length){
            add(board,ans);
            return;
        }
        for(int col=0;col<board[currentRow].length;col++){
            if(canPlace(board,currentRow,col)){
                board[currentRow][col]=true;
                solve(board,ans,currentRow+1);
                board[currentRow][col]=false;
            }
        }
    }
    
    public List<List<String>> solveNQueens(int n) {
        boolean board[][]=new boolean[n][n];
         List<List<String>>ans=new ArrayList<>();
        solve(board,ans,0);
        return ans;
        
    }
}