package ocp.b.shape;

public class Rectangle implements Shape {

    private final Type type = Type.RECTANGLE;;



    @Override
    public Type getType() {
        return type;
    }
}
