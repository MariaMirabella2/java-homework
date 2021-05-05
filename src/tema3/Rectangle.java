package tema3;

public class Rectangle {
    private double length,width ;

    public Rectangle(double width, double length) {
        this.length = (length<0)?0 : length;
        this.width = (width<0)?0:width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return width*length;
    }
}
