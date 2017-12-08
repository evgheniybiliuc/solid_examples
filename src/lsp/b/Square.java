package lsp.b;


public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        this.width = width;
        height = width;
    }

    @Override
    public void setHeight(int height) {
        width = height;
        this.height = height;
    }

}
