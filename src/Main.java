import java.util.*;

public class Main {
    public static void main(String[] args) {
        double result;
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Shape mostExpensive;
        Shape cir1 = new Circle(5, Colour.RED);
        Shape cir2 = new Circle(3, Colour.BLUE);
        Shape cir3 = new Circle(5, Colour.GREEN);
        Shape sq1 = new Square(2, 3, Colour.RED);
        Shape sq2 = new Square(3, 4, Colour.BLUE);
        Shape sq3 = new Square(4, 5, Colour.GREEN);
        shapes.add(cir1);
        shapes.add(cir2);
        shapes.add(cir3);
        shapes.add(sq1);
        shapes.add(sq2);
        shapes.add(sq3);
        result = calculateCost(shapes, Colour.RED);
        System.out.println("Cost= " + result);
        mostExpensive = findMostExpensive(shapes);
        System.out.println("Most Expensive: " + mostExpensive + " " + mostExpensive.size() * mostExpensive.colour().cost);

    }

    private static double calculateCost(List<Shape> shapes, Colour filterColour) {
        double shapeCost = 0;
        double sumShapeCost = 0;
        for (Shape elem : shapes) {
            if (elem.colour() == filterColour) {
                shapeCost = elem.size() * filterColour.cost;
                sumShapeCost += shapeCost;
            }
        }
        return sumShapeCost;
    }

    private static Shape findMostExpensive(List<Shape> shapes) {
        TreeSet<Shape> ex = new TreeSet<Shape>();
        for (Shape elem : shapes) {
            ex.add(elem);
        }
        return ex.last();
    }

}


