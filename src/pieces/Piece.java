package pieces;


public class Piece {

    private String color;
    private MoveBehavior moveBehavior;

    public Piece() {

    }

    public Piece(String color) {
        this.color = color;
    }


    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public boolean isMated() {
        return false;
    }


    public String move() {
        return moveBehavior.move();
    }
}
