public class Circle implements Shape {
    private int radius;
    private Colour colour;

    Circle(int radius, Colour colour) {
        this.radius = radius;
        this.colour = colour;
    }

    @Override
    public double size() {
        return Math.PI * Math.pow(radius, 2);
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
