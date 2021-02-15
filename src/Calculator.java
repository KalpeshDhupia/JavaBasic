import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = scanner.nextInt();
        System.out.println("Enter the second value");
        int b = scanner.nextInt();
        System.out.println("Enter the operator");
        char operator = scanner.next().charAt(0);
        switch (operator){
            case '+':
                add(a,b);
                break;
            case '-':
                sub(a,b);
                break;
            case '*':
                mul(a,b);
                break;
            case '/':
                div(a,b);
                break;
        }
    }
    static int c = 0;
    private static void div(int a, int b) {
        c = a/b;
        System.out.println("the division of "+a+"/"+b+ " is " +c);
    }

    private static void mul(int a, int b) {
        c = a*b;
        System.out.println("The multiplication of "+a+"*"+b+ " is " +c);
    }




    private static void sub(int a, int b) {
        c = a - b;
        System.out.println("The difference of " +a+"-"+b+ " is " +c);
    }


    private static void add(int a, int b) {
        c = a+b;
        System.out.println("The sum of "+ a +" + "+ b +" is "+ c);
    }

}
