package ocp.b.drawer;

import ocp.b.shape.Circle;
import ocp.b.shape.Rectangle;
import ocp.b.shape.Shape;

public class GraphicEditor implements Drawer<Shape> {

    @Override
    public void draw(Shape obj) {

        switch (obj.getType()){
            case CIRCLE:
                drawCircle((Circle) obj);
                break;
            case RECTANGLE:
                drawRectangle((Rectangle) obj);
                break;
        }
    }

    private void drawRectangle(Rectangle obj) {
        System.out.println("Hey ....its Rectangle...");
        System.out.println("Retrieving some information..");
        System.out.println("What a beautiful Shape :"+obj.getType());
    }

    private void drawCircle(Circle obj) {
        System.out.println("Hey ....its Circle...");
        System.out.println("Retrieving some information..");
        System.out.println("What a beautiful Shape :"+obj.getType());
    }
}
