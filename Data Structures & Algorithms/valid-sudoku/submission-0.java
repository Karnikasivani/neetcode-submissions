class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set set = new HashSet();
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                char c = board[i][j];
                if(c != '.') {
                    if(!set.add(c+"in Row"+i)
                     ||!set.add(c+"in Col"+j)
                     ||!set.add(c+"in block"+i/3+'.'+j/3)) return false;
                }
            }
        }
        return true;
    }
}

/*
0.declare set as object set
1.it is 2d array
2.loop thr 2d matrix
3.proceed if char is not '.'
4.add n check if char in row, column, block
5.return true if condition meets
*/