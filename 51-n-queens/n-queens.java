class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
    
        List<List<String>> list = new ArrayList<>();
        queens(board,0,0,list);
        return list;
    }

    static void queens(boolean [][]board, int row, int col, List<List<String>> list){
        if(row==board.length){
          
            list.add(display(board));
            return;
        }
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
                board[row][i]= true;
                queens(board,row+1,col,list);
                board[row][i] = false;
            }
        }
    }

    static List<String> display(boolean[][] board){
        List<String> internal = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            StringBuilder row = new StringBuilder();
            for(int j=0;j<board.length;j++){
                if(board[i][j]==true){
                    row.append("Q");
                }
                else row.append(".");
            }

            internal.add(row.toString());
        }
        return internal;
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        for(int i=0;i<row;i++){
            if(board[i][col] == true){
                return false;
            }
        }

        int maxLeft = Math.min(row, col);
        for(int i=1;i<=maxLeft;i++){
           if( board[row-i][col-i] == true){
               return false;
           }
        }

         int maxRight = Math.min(row, board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if( board[row-i][col+i] == true){
               return false;
           }
        }

        return true;
    }
}