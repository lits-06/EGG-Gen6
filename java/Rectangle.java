public class Rectangle {
    private double length;
    private double width;
    private String name;

    public Rectangle(double length, double width, String name) {
        this.length = length;
        this.width = width;
        this.name = name;
    }

    public double caculateArea() {
        return length * width;
    }

    public double caculatePerimeter() {
        return 2 * (length + width);
    }

    public String getName() {
        return name;
    }
}