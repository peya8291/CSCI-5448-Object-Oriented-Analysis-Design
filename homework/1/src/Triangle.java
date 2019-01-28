public class Triangle extends Shape {
    @Override
    public boolean display() {
        System.out.format("A triangle with z value:\t %f\n", z);
        return true;
    }
    public Triangle(float z) {
        this.z = z;
    }
}
