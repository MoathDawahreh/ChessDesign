package pieces;

public class KnightBehavior implements MoveBehavior{
    @Override
    public String move() {
        System.out.println( "Move L, even over the pieces");
        return "Move L, even over the pieces";
    }

}
