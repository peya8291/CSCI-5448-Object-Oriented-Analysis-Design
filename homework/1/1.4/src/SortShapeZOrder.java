import java.util.Arrays;
import java.util.List;

public class SortShapeZOrder implements SortShape {
    public boolean sort(List<Shape> shapeList) {
        shapeList.sort(new ComparatorShapeZOrder()); // sort the list of shapes by z coordinate in the ascending order
        return true;
    }
}
