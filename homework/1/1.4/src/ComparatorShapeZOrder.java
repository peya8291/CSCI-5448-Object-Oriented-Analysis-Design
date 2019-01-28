import java.util.Comparator;

public class ComparatorShapeZOrder implements Comparator<Shape> {
    public int compare(Shape a, Shape b) {
        if(a.z > b.z) {
            return 1;
        }
        else if (a.z < b.z){
            return -1;
        }
        else {
            return 0;
        }
    }
}
