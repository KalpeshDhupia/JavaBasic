public class Square extends Shape{
    int a;
    public Square(int a){
        this.a = a;
    }

    @Override
    int calculateArea() {
        return a*a;
    }
}

