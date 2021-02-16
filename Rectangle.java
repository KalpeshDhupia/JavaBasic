public class Rectangle extends Shape{
    int a, b;
    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;

    }
    @Override
    int calculateArea() {
return a*b;
    }
}
