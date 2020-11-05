public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape("vermelho", true);

        System.out.println("Imprimindo dados Shape métodos get: ");
        System.out.println("Cor: " + shape.getColor());
        System.out.println("Filled: " + shape.getFilled());
        System.out.println("");
        System.out.println(shape);
        System.out.println("");


        Circle circle = new Circle("Rosa", true, 4);

        System.out.println("Imprimindo dados Circle métodos get: ");
        System.out.println("Cor: " + circle.getColor());
        System.out.println("Filled: " + circle.getFilled());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimetro: " + circle.getPerimeter());
        System.out.println("");
        System.out.println(circle);
        System.out.println("");

        Rectangle rectangle = new Rectangle("Verde", false, 3, 4);

        System.out.println("Imprimindo dados Rectangle métodos get: ");
        System.out.println("Cor: " + rectangle.getColor());
        System.out.println("Filled: " + rectangle.getFilled());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimetro: " + rectangle.getPerimeter());
        System.out.println("");
        System.out.println(rectangle);
        System.out.println("");

        Square square = new Square("azul", false, 3);

        System.out.println("Imprimindo dados Square métodos get: ");
        System.out.println("Cor: " + square.getColor());
        System.out.println("Filled: " + square.getFilled());
        System.out.println("Side: " + square.getSide());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimetro: " + square.getPerimeter());
        System.out.println("");
        System.out.println(square);
        System.out.println("");
    }
}