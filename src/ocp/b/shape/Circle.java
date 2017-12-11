package ocp.b.shape;


public class Circle implements Shape {

    private Type type = Type.CIRCLE;


    @Override
    public Type getType() {
        return type;
    }
}
