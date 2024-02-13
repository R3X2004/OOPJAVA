
abstract class Shape {
 
    public abstract void draw();
    public abstract void erase();
}


class Circle extends Shape {
 
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

 
    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}


class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

   
    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}


class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }


    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}


	class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        
        Shape shape1 = circle;
        Shape shape2 = triangle;
        Shape shape3 = square;


        shape1.draw();
        shape1.erase();
        shape2.draw();
        shape2.erase();
        shape3.draw();
        shape3.erase();
    }
}
