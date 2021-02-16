public class ShapeDriver {
    public static void main(String[] args) {
        int a = 10, b = 20;
        Shape square = new Square(10);
        System.out.println("Square area is "+square.calculateArea());
        Shape rectangle = new Rectangle(10,20);
        System.out.println("Rectangle area is "+rectangle.calculateArea());
    }
}
