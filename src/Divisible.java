public class Divisible {
    public static void main(String[] args) {
        int n = 52;
        divisileBy5(n);

    }

    private static void divisileBy5(int n) {
        if(n % 5 == 0){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
    }
}
