import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int databaseSize = 10; // the size of the virtual "database"

        Random shapeIndicator = new Random(); // an integer used as indicator for the type of shape, 0:circle 1:square 2:triangle
        Random z = new Random();

        List<Shape> shapeList = new ArrayList<>();
        for(int i = 0; i < databaseSize; i++) {
            // generate new shapes with random z coordinates until reaching the size of database
            switch (shapeIndicator.nextInt(3)) {
                case 0:
                    Shape newCircle = new Circle(z.nextFloat());
                    shapeList.add(newCircle);
                    break;
                case 1:
                    Shape newSquare = new Square(z.nextFloat());
                    shapeList.add(newSquare);
                    break;
                case 2:
                    Shape newTriangle = new Triangle(z.nextFloat());
                    shapeList.add(newTriangle);
                    break;
                default:
                    break;
            }
        }

        SortShape sorter = new SortShapeZOrder();
        sorter.sort(shapeList); // sort the list of shapes by their z coordinate

        System.out.format("There are %d shapes in the database\n", databaseSize); // print the number of shapes
        for(Shape shapeObj : shapeList) {
            // print shapes in the list, one line for each
            shapeObj.display();
        }
    }
}
