package ocp.g.shape;

public interface Shape {
    Type getType();

    void draw();

    enum Type {
        RECTANGLE, CIRCLE
    }
}
