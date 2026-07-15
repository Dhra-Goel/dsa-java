import java.util.ArrayList;
import java.util.List;
//we are checking like -----> not in 'v' this way
class LC_51_NQueen {
    public boolean isSafe(int row, int col, char[][] board){
        //vertical
        for(int r = row; r>=0; r--){
            if(board[r][col] == 'Q')
                return false;
        }

        //horizontal no need in row wise bcoz if there is safe place it will automatically redirect to next row

        //top-left diagonal
        for(int r = row-1, c = col-1; r>=0 && c>=0; r--,c-- ){
            if(board[r][c] == 'Q')
                return false;
        }

        //top-right diagonal
        for(int r = row-1, c = col+1; r>=0 && c< board.length; r--,c++ ){
            if(board[r][c] == 'Q')
                return false;
        }

        return true;
    }


    public void saveBoard(char[][] board, List<List<String>> allBoards){
        List<String> newBoard = new ArrayList<>();
        String eachRow = ""; //this is each row of the new board that will be added to nb.

        for(int r = 0; r< board.length; r++){
            eachRow = "";
            for(int c = 0; c< board.length; c++){
                if (board[r][c]=='Q')
                    eachRow += 'Q';
                else
                    eachRow += '.';
            }
            newBoard.add(eachRow);
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board,List<List<String>> allBoards, int row, int n ){
        if (row==n){
            saveBoard(board, allBoards);
            return;
        }

        for (int col = 0; col<n; col++ ){
            if (isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board, allBoards, row+1, n);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0, n);
        return allBoards;
    }

}

//main fn is absent as it is done using LC-51
