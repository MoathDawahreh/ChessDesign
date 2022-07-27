package pieces;

public class Bishop extends Piece {

    public Bishop() {
        setMoveBehavior(new BishopBehavior());
    }


}
