package task3;

public class GeometryCalculator {
    public static void main(String[] args) {


        Circle circle = new Circle(5.0);

        Rectangle rectangle = new Rectangle(4.0, 6.0);

        Triangle triangle = new Triangle(6.0, 7.0);

        System.out.println("Радиус круга: " + circle.calculateArea());
        System.out.println("Периметр круга: " + circle.calculatePerimeter());

        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());

        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());

    }
    }


