public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }
}
