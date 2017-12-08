package ocp.g.shape;

public class Rectangle implements Shape {

    private final Type type = Type.RECTANGLE;;

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void draw() {
        System.out.println("Hey ....its Rectangle...");
        System.out.println("Retrieving some information..");
        System.out.println("What a beautiful Shape : " + getType());
    }
}
