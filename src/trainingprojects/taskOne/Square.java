package trainingprojects.taskOne;

public class Square implements Shape {

    private float length;

    public Square(float length) {
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public void area() {
        double area = length * length;
        System.out.println("Area of circle : "+area);
    }

    @Override
    public void circumference() {
        double circumference = 4 * length;
        System.out.println("Circumference of circle : "+ circumference);
    }

}
