public class CalculatorTestDrive {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
         int length = calculator.add(2,3);
         double breadth = calculator.add(2.00,5.001);
         calculator.calculateArea(length,breadth);
    }
}
