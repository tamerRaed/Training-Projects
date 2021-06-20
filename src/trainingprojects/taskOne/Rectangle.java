package trainingprojects.taskOne;

public class Rectangle implements Shape {

    private float width, height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void area() {
        float area = height * width;
        System.out.println("Area of circle : "+ area);
    }

    @Override
    public void circumference() {
        float circumference = 2 * (height + width);
        System.out.println("Circumference of circle : "+ circumference);
    }
}
