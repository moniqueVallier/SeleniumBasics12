package seleniumBasics.groupProject;
import java.awt.*;

public class part1 {
    public interface Shape {

        double CalculateArea();
        double CalculatePerimeter();
    }

    class Square implements Shape {

        private double length;
        private double width;

        public Square(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double CalculateArea() {

            return length * width;
        }

        @Override
        public double CalculatePerimeter() {

            return 2 * (length + width);
        }
    }

    class Circle implements Shape {

        private double radius;

        public Circle(double radius) {
            this.radius = radius;

        }

        @Override
        public double CalculateArea() {

            return Math.PI * radius * radius;
        }

        @Override
        public double CalculatePerimeter() {

            return 2 * Math.PI * radius;
        }
    }
            double length = 6.0;
            double width = 6.0;
            Square s = new Square(length,width);

            System.out.println("Square - Area: " + s.CalculateArea());
            System.out.println("Square - perimeter: " + s.CalculatePerimeter());


            double radius = 2.0;
            Circle c = new Circle(radius);
            System.out.println("Circle - Area: " + c.CalculateArea());
            System.out.println("Circle - perimeter: " + c.CalculatePerimeter());

        }

