import java.util.ArrayList;
import java.util.List;

public class backtracking {
    // public static void permutation(String str,String perm,int index)
    // {
    //     if(str.length()==0)
    //     {
    //         System.out.println(perm);
    //         return;
    //     }
    //     for(int i=0;i<str.length();i++)
    //     {
    //         char currentchar=str.charAt(i);
    //          String newStr =
    //             str.substring(0, i) +
    //             str.substring(i + 1);
    //         permutation(newStr, perm+currentchar, index+1);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str="ABC";
    //     permutation(str, "", 0);
    // }





    //N - Queen problem...
    // public boolean isSafe(int row, int col, char[][] board)
    // {
    //     for(int j=0;j<board.length;j++)
    //     {
    //         if(board[row][j]=='Q')
    //         {
    //             return false;
    //         }

    //     }
    //     for(int i=0;i<board[0].length;i++)
    //     {
    //         if(board[i][col]=='Q')
    //         {
    //             return false;
    //         }
    //     }

    //     //upper left
    //     int r=row;
    //     for(int c=col; c>=0 && r>=0;c--,r--)
    //     {
    //         if(board[r][c] == 'Q')
    //         {
    //             return false;
    //         }
    //     }

    //     r=row;
    //     for(int c=col; c<board.length && r>=0;c++,r--)
    //     {
    //         if(board[r][c]=='Q')
    //         {
    //             return false;
    //         }
    //     }
    //     r=row;
    //     for(int c=col; r<board.length && c>=0;c--,r++)
    //     {
    //         if(board[r][c]=='Q')
    //         {
    //             return false;
    //         }
    //     }
    //     r=row;
    //     for(int c=col; r<board.length && c<board.length;c++,r++)
    //     {
    //         if(board[r][c]=='Q')
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public void saveboard(char[][] board,List<List<String>> allboard)
    // {
    //     String row="";
    //     List<String> newBoard=new ArrayList<>();

    //     for(int i=0;i<board.length;i++)
    //     {
    //         row="";
    //         for(int j=0;j<board.length;j++)
    //         {
    //             if(board[i][j]=='Q')
    //             {
    //                 row +='Q';
    //             }
    //             else
    //             {
    //                 row +='.';
    //             }
    //         }
    //         newBoard.add(row);
    //     }
    //     allboard.add(newBoard);
    // }
    // public void helper(char[][] board,List<List<String>> allboard , int col)
    // {
    //     if(col==board.length)
    //     {
    //         saveboard(board,allboard);
    //         return;
    //     }
    //     for(int row=0;row<board.length;row++)
    //     {
    //         if(isSafe(row,col,board))
    //         {
    //             board[row][col]='Q';
    //             helper(board,allboard,col+1);
    //             board[row][col]='.';
    //         }
    //     }
    // }
    // public List<List<String>> solveNQueens(int n) {
    //     List<List<String>> allboads= new ArrayList<>();
    //     char[][] board=new char[n][n];
    //     helper(board,allboads,0);
    //     return allboads;
    // }


    //sudo solver

    public boolean isSafe(char[][] board,int row, int col,int number){

        for(int i=0;i<board.length;i++)
        {
            if(board[i][col]==(char)(number +'0'))
            {
                return false;
            }
            if(board[row][i]==(char)(number +'0'))
            {
                return false;
            }
        }
         //grid
        int gr=(row/3)*3;
        int gc=(col/3)*3;
        for(int i=gr;i<gr+3;i++)
        {
            for(int j =gc;j<gc+3;j++)
            {
                if(board[i][j]==(char)(number+'0')){
                    return false;
                }
            }
        }
        return true;

    }
    public boolean helper(char[][] board,int row,int col)
    {
        if(row==board.length)
        {
            return true;
        }
        int newrow=0;
        int newcol=0;
        if(col != board.length-1)
        {
            newrow=row;
            newcol=col+1;
        }
        else{
            newrow=row+1;
            newcol=0;
        }
        if(board[row][col] != '.')
        {
           if( helper(board, newrow, newcol))
            {
                return true;
            }
        }
        else
        {
            for(int i=1;i<10;i++)
            {
                if(isSafe(board,row,col,i))
                {
                    board[row][col]=(char)(i+'0');
                    if(helper(board, newrow, newcol))
                    {
                        return true;
                    }else{
                        board[row][col]='.';
                    }
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board)
    {
        helper(board, 0, 0);
        
    }
}
