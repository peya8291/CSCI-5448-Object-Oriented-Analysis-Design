public class Circle extends Shape {
    @Override
    public boolean display() {
        System.out.format("A circle with z value:\t %f\n", z);
        return true;
    }
    public Circle(float z) {
        this.z = z;
    }
}
