public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * (radius*radius);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() +
                ", radius=" + radius +
                '}';
    }
}