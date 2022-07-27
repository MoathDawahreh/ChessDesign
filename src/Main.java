import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ChessGame game = new ChessGame("Moath", "Hamzeh");
        while (!game.isDone()) {
            String move = bufferedReader.readLine().trim();

            //  String move = "B7"; //read_move_from_cosole();
            if (game.isWhiteTurn())
                game.playWhite(move);
            else
                game.playBlack(move);
        }

        game.printWinnerName();

    }
}
