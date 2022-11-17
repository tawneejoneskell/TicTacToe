import Models.Gameboard;
import Models.Player;

public class Main {
    public static void main(String[] args) {
        Player playerOne = new Player('x');
        Player playerTwo = new Player('o');

        Gameboard myBoard = new Gameboard(3, 3);

        myBoard.takeTurn("X", 0, 2);
        myBoard.takeTurn("O", 1, 1);
    }
}