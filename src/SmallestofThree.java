public class SmallestofThree {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 2;
        if(b>a && c>a)
            System.out.println(a);
        if(a>b && c>b)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
