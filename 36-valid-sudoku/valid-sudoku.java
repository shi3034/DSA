class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean rows[][]=new boolean[9][9];
        boolean col[][]=new boolean[9][9];
        boolean grid[][]=new boolean[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')
                continue;
                int num=board[i][j]-'1';
                int box=(i/3)*3+(j/3);

                if(rows[i][num] || col[j][num] || grid[box][num])
                return false;
                rows[i][num]=true;
                col[j][num]=true;
                grid[box][num]=true;

            }
        }
        return true;
    }
}