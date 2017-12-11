package ocp.g.drawer;

import ocp.g.shape.Shape;

public class GraphicEditor implements Drawer<Shape> {

    @Override
    public void draw(Shape shape) {
        shape.draw();
    }

}
