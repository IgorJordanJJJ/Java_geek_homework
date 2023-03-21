public class Task_3 {
    private static final int BOARD_SIZE = 8;
    private static final int EMPTY = 0;
    private static final int QUEEN = 1;
    private static int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
    
    public static void main(String[] args) {
        solve(0);
        displayBoard();
    }                       
    
    private static boolean solve(int col) {
        if (col >= BOARD_SIZE) {
            return true;
        }
        
        for (int row = 0; row < BOARD_SIZE; row++) {
            if (isSafe(row, col)) {
                placeQueen(row, col);
                if (solve(col + 1)) {
                    return true;
                }
                removeQueen(row, col);

            }
        }
        
        return false;
    }
    
    private static boolean isSafe(int row, int col) {
        // Check if there's a queen on the same row
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[row][i] == QUEEN) {
                return false;
            }
        }
        
        // Check upper diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == QUEEN) {
                return false;
            }
        }
        
        // Check lower diagonal
        for (int i = row, j = col; i < BOARD_SIZE && j >= 0; i++, j--) {
            if (board[i][j] == QUEEN) {
                return false;
            }
        }
        
        return true;
    }
    
    private static void placeQueen(int row, int col) {
        board[row][col] = QUEEN;
    }
    
    private static void removeQueen(int row, int col) {
        board[row][col] = EMPTY;
    }
    
    private static void displayBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] == QUEEN ? "Q" : "-");
            }
            System.out.println();
        }
    }
}
