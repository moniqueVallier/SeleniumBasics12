package seleniumBasics.groupProject;

public class part1b {
        public static void main(String[] args) {

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
    }
