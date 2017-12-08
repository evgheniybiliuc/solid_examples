package lsp.b;

public class Main {

    public static void main(String[] args) {
        Rectangle square = RectangleFactory.createRectangle();

        square.setWidth(10);
        square.setHeight(5);
        //expected 50 but actually 25 =)
        int area = square.area();
    }
}
