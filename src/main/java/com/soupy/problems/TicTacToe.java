public class TicTacToe {
    private int[] rows;
    private int[] cols;
    private int diagonal = 0;
    private int antiDiagonal = 0;
    private int n; // size of the board
    private int player1 = 1;
    private int player2 = -1;

    public TicTacToe(int n) {
        rows = new int[n];
        cols = new int[n];
        this.n = n;
    }    

    public int move(int row, int col, int player) {
        int playerValue = (player == 1) ? player1 : player2;

        rows[row] += playerValue;
        cols[col] += playerValue;

        if (row == col) // Check main diagonal
            diagonal += playerValue;

        if (row + col == n - 1) // Check anti-diagonal
            antiDiagonal += playerValue;

        if (Math.abs(rows[row]) == n || 
            Math.abs(cols[col]) == n || 
            Math.abs(diagonal) == n || 
            Math.abs(antiDiagonal) == n) // Check for a win
            return player;

        return 0; // No winner yet
    }
}
