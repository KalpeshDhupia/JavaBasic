import java.util.Scanner;
public class Calculator extends Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
Calculator calculator = new Calculator();
        System.out.println("Enter the choice");
        char sign = scanner.next().charAt(0);
        System.out.println("Enter the numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        switch (sign){
            case '+':
                System.out.println("The addition of "+a+" and "+b+" is "+calculator.addition(a,b));
                break;
            case '-':
                System.out.println("The subtraction of "+a+" and "+b+" is "+calculator.subtraction(a,b));
                break;
            case  '*':
                System.out.println("The multiplication of "+a+" and "+b+" is "+calculator.multiplication(a,b));
                break;
            case '/':
                System.out.println("The division of "+a+" and "+b+" is "+calculator.division(a,b));
                break;
            default:
                System.out.println("not found");
        }
    }
}
