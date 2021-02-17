public class Circle {
    String r ;


    public Circle(String r) {
        this.r = r;
    }
    void calculateCircumference(){
        String temp[] = r.split(" ");
        int i = Integer.parseInt(temp[0]);
        System.out.println("Circumference of the circle is "+2*3.14*i);
}

    public static void main(String[] args) {
        Circle circle = new Circle("10 cm");
        circle.calculateCircumference();
    }
}
