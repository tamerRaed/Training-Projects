package trainingprojects.taskOne;

public class Circle implements Shape {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle : "+ area);
    }

    @Override
    public void circumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of circle : "+circumference);
    }

}
