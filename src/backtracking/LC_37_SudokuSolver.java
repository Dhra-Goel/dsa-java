class LC_37_SudokuSolver {

    public boolean isSafe(char[][] board, int row, int col, int number){
        //for row and column
        for (int i = 0; i<board.length; i++){
            if(board[i][col] == (char)(number+'0'))
                return false;

            if(board[row][i] == (char)(number+'0'))
                return false;
        }

        //within the grid
        int startRow = (row/3) *3;
        int startCol = (col/3) *3;

        for(int i = startRow; i<startRow+3; i++){
            for(int j = startCol; j<startCol+3; j++){
                if(board[i][j] == (char)(number+'0') )
                    return false;
            }
        }

        return true;
    }

    public boolean solve(char[][] board, int row, int col){
        if(row == board.length) {
            return true;
        }

        //find the next cell
        int nrow = 0;
        int ncol = 0;

        if(col == board.length-1){
            nrow = row+1;
            ncol = 0;
        }
        else {
            ncol = col+1;
            nrow = row;
        }

        //agr filled h toh next cell pe move krenge or true return krenge
        if(board[row][col] != '.'){
            if(solve(board, nrow, ncol))
                return true;
        }

        //filled nhi h toh fill krenge ab 1-9 tk
        else{
            for(int i = 1; i<=9; i++){
                if(isSafe(board, row, col, i)){
                    board[row][col] = (char)(i+'0');
                    if(solve(board, nrow, ncol))
                        return true;
                    else{
                        board[row][col] = '.';
                    }
                }

            }


        }

        return false;

    }

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
}
