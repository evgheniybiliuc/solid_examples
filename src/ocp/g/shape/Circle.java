package ocp.g.shape;


public class Circle implements Shape {

    private Type type = Type.CIRCLE;;

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void draw() {
        System.out.println("Hey ....its Circle...");
        System.out.println("Retrieving some information..");
        System.out.println("What a beautiful Shape :"+getType());
    }
}
