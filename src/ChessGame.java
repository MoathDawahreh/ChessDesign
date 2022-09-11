import pieces.Bishop;
import pieces.BishopBehavior;
import pieces.Piece;

public class ChessGame implements Chess {


    private final String white;
    private final String black;
    private boolean whiteTurn = true;

    public ChessGame(String white, String black) {
        this.white = white;
        this.black = black;
    }

    @Override
    public boolean isDone() {

        Piece piece = new Piece();
        return piece.isMated();
    }

    @Override
    public boolean isWhiteTurn() {
        return whiteTurn;
    }

    @Override
    public void playWhite(String value) {
        System.out.println("white is playing");
        Move move = new Move(this.white, value);
        if (move.isLegal(value)) {
            move.move();
            Bishop bishop = new Bishop();
            Piece piece = new Piece();
            bishop.move();

           pice.setMoveBehavior(new BishopBehavior());
            whiteTurn = false;

        } else {
            whiteTurn = true;

        }

    }

    @Override
    public void playBlack(String value) {
//
//        System.out.println("black is playing");
//        Move move = new Move(this.black, value);
//        move.move();

        whiteTurn = true;

    }

    @Override
    public void printWinnerName() {
        System.out.println(white);

    }


}
