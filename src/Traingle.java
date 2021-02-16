public class Traingle {
    int side1;
    int side2;
    int base;
    public Traingle(int side1, int side2, int base){
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
    }
    void calPerimeter(){
        float p = (side1 + side2 + base);
        System.out.println("The perimeter of a triangle is "+p+" sq.cm");
    }

    public static void main(String[] args) {
        Traingle traingle = new Traingle(40,30,20);
        traingle.calPerimeter();
    }
}
