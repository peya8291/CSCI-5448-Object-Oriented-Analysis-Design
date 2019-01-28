public class Square extends Shape {
    @Override
    public boolean display() {
        System.out.format("A square with z value:\t %f\n", z);
        return true;
    }
    public Square(float z) {
        this.z = z;
    }
}
