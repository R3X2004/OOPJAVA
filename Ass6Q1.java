import java.lang.*;

abstract class GeometricFigure {
    double dim1, dim2;

    abstract double getArea();
}


class Rectangle extends GeometricFigure {
    Rectangle(double length, double breadth) {
        this.dim1 = length;
        this.dim2 = breadth;
    }

    
    double getArea() {
        return dim1 * dim2;
    }
}

// Concrete class Triangle
class Triangle extends GeometricFigure {
    Triangle(double base, double height) {
        this.dim1 = base;
        this.dim2 = height;
    }

    
    double getArea() {
        return 0.5 * dim1 * dim2;
    }
}

// Driver class
	class Main {
    public static void main(String[] args) {
        GeometricFigure figure; 

        
        figure = new Rectangle(5, 3);
        System.out.println("Area of Rectangle: " + figure.getArea());

       
        figure = new Triangle(4, 6);
        System.out.println("Area of Triangle: " + figure.getArea());
    }
}
