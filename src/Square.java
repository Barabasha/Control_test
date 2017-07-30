public class Square implements Shape {
    private int length;
    private int width;
    private Colour colour;

    Square(int length, int width, Colour colour) {
        this.length = length;
        this.width = width;
        this.colour = colour;
    }

    @Override
    public double size() {
        return length * width;
    }

    @Override
    public Colour colour() {
        return this.colour;
    }

    @Override
    public int compareTo(Shape shape) {
        Shape entry = (Shape) shape;
        double result = this.size() * this.colour.cost - entry.size() * entry.colour().cost;
        if (result != 0) {
            return (int) (result / Math.abs(result));
        }
        return 0;
    }
}
