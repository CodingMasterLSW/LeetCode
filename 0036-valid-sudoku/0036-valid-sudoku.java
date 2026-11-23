class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if (!calRow(i, j, board)) {
                    return false;
                }
                
                if (!calCol(i, j, board)) {
                    return false;
                }
                if (!calSquare(i, j, board)) {
                    return false;
                }

            }
        }
        return true;
    }

    public boolean calRow(int a, int b, char[][] board) {
        Set<Character> arr = new HashSet<>();
        arr.add(board[a][b]);
        for (int i=0; i<9; i++) {
            if (i == b || board[a][i] == '.') {
                continue;
            }
            if (!arr.add(board[a][i])) {
                return false;
            }
        }
        return true;
    }

    public boolean calCol(int a, int b, char[][] board) {
        Set<Character> arr = new HashSet<>();
        arr.add(board[a][b]);
        for (int i=0; i<9; i++) {
            if (i == a || board[i][b] == '.') {
                continue;
            }
            if (!arr.add(board[i][b])) {
                return false;
            }
        }
        return true;
    }

    public boolean calSquare(int a, int b, char[][] board) {
        int newA = (a/3) * 3;
        int newB = (b/3) * 3;

        Set<Character> arr = new HashSet<>();

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (board[newA+i][newB+j] == '.') {
                    continue;
                }
                if (!arr.add(board[newA+i][newB+j])) {
                    return false;
                }
            }
        }
        return true;
    }
}


// -> ex) (4, 4) -> 4번째 칸 -> (1 * 3) + 마지막 칸 
// 즉, (행 / 3) * 3 + (열/3) 

