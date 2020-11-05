public class Square extends Rectangle {

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return getWidth();
    }

    @Override
    public String toString() {
        return "Square{" + super.toString() +
                '}';
    }
}