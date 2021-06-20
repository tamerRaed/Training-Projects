
package trainingprojects.taskOne;

public  class Triangle implements Shape{
    private float baseLength;
    private float height;
    private float firstRib;
    private float secondRib;
    private float thirdRib;

    public Triangle(float baseLength, float height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    public Triangle(float firstRib, float secondRib, float thirdRib) {
        this.firstRib = firstRib;
        this.secondRib = secondRib;
        this.thirdRib = thirdRib;
    }

    public float getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(float baseLength) {
        this.baseLength = baseLength;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getFirstRib() {
        return firstRib;
    }

    public void setFirstRib(float firstRib) {
        this.firstRib = firstRib;
    }

    public float getSecondRib() {
        return secondRib;
    }

    public void setSecondRib(float secondRib) {
        this.secondRib = secondRib;
    }

    public float getThirdRib() {
        return thirdRib;
    }

    public void setThirdRib(float thirdRib) {
        this.thirdRib = thirdRib;
    }
    
    
    
    @Override
    public void area() {
        double area = 0.5 * baseLength * height;
        System.out.println("Area of circle : "+ area);
    }

    @Override
    public void circumference() {
        float circumference = firstRib + secondRib + thirdRib;
        System.out.println("Circumference of circle : "+ circumference);
    }
}
