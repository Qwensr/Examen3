package task3;

public class Triangle extends Shape{
    private double length;
    private double width;


    public Triangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width ;
    }

    @Override
    public double calculatePerimeter() {
        return 2 *(length + width);
    }
}


