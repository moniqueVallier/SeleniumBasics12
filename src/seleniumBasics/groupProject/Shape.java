package seleniumBasics.groupProject;

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

