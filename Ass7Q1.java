interface Calculator {
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
}

class DemoCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override 
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }
}

	class Ass7Q1 {
    public static void main(String[] args) {
        Calculator calculator = new DemoCalculator();
        
        int result = calculator.add(5, 3);
        System.out.println("Addition: " + result);
        
        result = calculator.sub(5, 3);
        System.out.println("Subtraction: " + result);
        
        result = calculator.mul(5, 3);
        System.out.println("Multiplication: " + result);
        
        result = calculator.div(5, 3);
        System.out.println("Division: " + result);
    }
}
