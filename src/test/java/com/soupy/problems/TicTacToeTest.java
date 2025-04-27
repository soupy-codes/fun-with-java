import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void testTicTacToe() {
        TicTacToe game = new TicTacToe(3);

        // Player 1 moves
        assertEquals(0, game.move(0, 0, 1)); // No winner
        assertEquals(0, game.move(1, 1, 1)); // No winner

        // Player 2 moves
        assertEquals(0, game.move(0, 1, 2)); // No winner
        assertEquals(0, game.move(1, 0, 2)); // No winner

        // Player 1 wins
        assertEquals(1, game.move(2, 2, 1)); // Player 1 wins diagonally
    }

    @Test
    void testHorizontalWin() {
        TicTacToe game = new TicTacToe(3);

        // Player 1 moves
        assertEquals(0, game.move(0, 0, 1)); // No winner
        assertEquals(0, game.move(0, 1, 1)); // No winner

        // Player 2 moves
        assertEquals(0, game.move(1, 0, 2)); // No winner
        assertEquals(0, game.move(1, 1, 2)); // No winner

        // Player 1 wins
        assertEquals(1, game.move(0, 2, 1)); // Player 1 wins horizontally
    }

    @Test
    void testVerticalWin() {
        TicTacToe game = new TicTacToe(3);

        // Player 1 moves
        assertEquals(0, game.move(0, 0, 1)); // No winner
        assertEquals(0, game.move(1, 0, 1)); // No winner

        // Player 2 moves
        assertEquals(0, game.move(0, 1, 2)); // No winner
        assertEquals(0, game.move(1, 1, 2)); // No winner

        // Player 1 wins
        assertEquals(1, game.move(2, 0, 1)); // Player 1 wins vertically
    }

    @Test
    void testAntiDiagonalWin() {
        TicTacToe game = new TicTacToe(3);

        // Player 1 moves
        assertEquals(0, game.move(0, 2, 1)); // No winner
        assertEquals(0, game.move(1, 1, 1)); // No winner

        // Player 2 moves
        assertEquals(0, game.move(0, 0, 2)); // No winner
        assertEquals(0, game.move(1, 0, 2)); // No winner

        // Player 1 wins
        assertEquals(1, game.move(2, 0, 1)); // Player 1 wins anti-diagonally
    }

    @Test
    void testNoWinner() {
        TicTacToe game = new TicTacToe(3);
   
        // Player 1 and Player 2 make moves without a winner
        assertEquals(0, game.move(0, 0, 1));
        assertEquals(0, game.move(0, 1, 2));
        assertEquals(0, game.move(0, 2, 1));
        assertEquals(0, game.move(1, 0, 2));
        assertEquals(0, game.move(1, 1, 1));
        assertEquals(0, game.move(1, 2, 2));
        assertEquals(0, game.move(2, 0, 2));
        assertEquals(0, game.move(2, 1, 1));
        assertEquals(0, game.move(2, 2, 2)); // No winner
    }
}