package ocp.b.shape;

public interface Shape {
    Type getType();

    enum Type {
        RECTANGLE, CIRCLE
    }
}
