class Solution {
    public void saveboard(char board[][],List<List<String>>allboard)
    {
        String row="";
        ArrayList<String>sboard=new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {   row="";
           for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='Q')
                {
                    row+='Q';
                }
                else
                {
                    row+='.';
                }
            }
            sboard.add(row);
        }
        allboard.add(sboard);
    }
    public boolean isSafe(char board[][],int row,int col)
    {
        //vertical
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            } 
        }
        //ver left
        for(int i=row-1,j=col-1;i>=0 &&j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            } 
        }
        //verright
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            } 
        }
        return true;
    }
    public void helper(char board[][],List<List<String>>allboard,int row)
    {   if(row==board.length)
        {
            saveboard(board,allboard);
            return;
        }
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j]='Q';
                helper(board,allboard,row+1);
                board[row][j]='.';
            }
        }
       
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>allboard=new ArrayList<>();
        char board[][]=new char[n][n];
        helper(board,allboard,0);
        return allboard;
    }
}