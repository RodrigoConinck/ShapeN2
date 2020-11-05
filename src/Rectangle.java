public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength(){
        return length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2* (width * length);
    }

    @Override
    public String toString() {
        return "Rectangle{" + super.toString() +
                ", width=" + width +
                ", lenght=" + length +
                '}';
    }
}