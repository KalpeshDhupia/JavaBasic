import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

    private Employee employee;
    private Customer customer;
    private List<Customer> customerList = new ArrayList<>();
    private List<Employee> employeeList = new ArrayList<>();
    private Customer currLoginUser;
    private Employee currLoginUser1;


    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println("Welcome to ICCI Bank");

        initialSteps(bank);
    }

    private static void initialSteps(Bank bank) {
        System.out.println("Enter your choice \n" +
                "1. Create an account \n" +
                "2. Login \n" +
                "3. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                bank.createAcc(bank);
                break;
            case 2:
                if (bank.isCustomerPresent()) {
                    System.out.println("Login Successful, You are an ICCI Bank customer.");
                    bank.loginCustomer();
                } else if (bank.isEmployeePresent()) {
                    System.out.println("Login successful, you are an ICCI Employee.");
                    bank.loginEmployee();
                }
            case 3:
                break;
            default:
                break;

        }

    }


    private void createAcc(Bank bank) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Account holder name ");
        String name = scanner.nextLine();
        System.out.println("Enter the password");
        String password = scanner.nextLine();
        System.out.println("Enter the Account No. ");
        String accNo = scanner.nextLine();
        System.out.println("Enter the starting balance ");
        double balance = scanner.nextDouble();
        System.out.println("Enter the role ");
        String role = scanner.nextLine();

        if (role.equals("customer") || role.equals("Customer")) {
            createCustomer(name, password, accNo, balance, role, bank);

        } else if (role.equals("employee") || role.equals("Employee")) {
            createEmployee(name, password, accNo, balance, role, bank);
        }
        initialSteps(bank);
    }

    private void createCustomer(String name, String password, String accNo, double balance, String role, Bank bank) {

        customer = new Customer();
        customer.setAccName(name);
        customer.setAccNo(accNo);
        customer.setPassWord(password);
        customer.setBalance(balance);
        customer.setRole(role);
        System.out.println("Account created Successfully");
        customerList.add(customer);
        initialSteps(bank);
    }

    private void createEmployee(String name, String password, String accNo, double balance, String role, Bank bank) {
        employee = new Employee();
        employee.setAccName(name);
        employee.setAccNo(accNo);
        employee.setPassWord(password);
        employee.setBalance(balance);
        employee.setRole(role);
        System.out.println("Account created Successfully");
        employeeList.add(employee);
        initialSteps(bank);

    }

    private void loginCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice \n" +
                "1. Deposit \n" +
                "2. Withdraw money \n" +
                "3. Transfer \n" +
                "4. Show balance \n" +
                "5. Exit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the amount to be deposit");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                currLoginUser.depositAmt(amount);
                currLoginUser.showBal();
                break;
            case 2:
                System.out.println("Enter the amount to be withdraw");
                double amtToWith = scanner.nextDouble();
                scanner.nextLine();
                currLoginUser.withDrawAmt(amtToWith);
                currLoginUser.showBal();
                break;
            case 3:
                System.out.println("Enter the amount to be transfer");
                System.out.println("Enter the receiver Account no.");
                String receiverAccNo = scanner.nextLine();
                scanner.nextLine();
                double transferAmt = scanner.nextDouble();
                currLoginUser.transferFunds(transferAmt, receiverAccNo);
                break;
            case 4:
                System.out.println("Show balance in the account");
                currLoginUser.showBal();
                break;
            case 5:
                System.out.println("Logging out......");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.exit(0);
                break;
        }
    }

    private void loginEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice \n" +
                "1. Show total number of accounts in the bank. \n" +
                "2. Search an account \n" +
                "3. Show Total balance in the bank \n" +
                "4. Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                double total_no = customerList.size() + employeeList.size();
                System.out.println("total no"+total_no);
            case 2:
                System.out.println("Enter Account No.");
                String acc_no = scanner.nextLine();
                int i = customerList.indexOf(acc_no);
                int j = employeeList.indexOf(acc_no);
                if(i == -1 && j == -1){
                    System.out.println("Account not found");
                }else {
                    System.out.println("Account is available");
                }
                break;
            case 3:
                double balC = 0 , balE = 0;
                for(int k =0; k< customerList.size(); k++){
                    balC = balC + customer.getBalance();
                }
                for(int k =0; k< customerList.size(); k++){
                    balE = balE + employee.getBalance();
                }
                System.out.println("Total balance is "+(balC+balE));
                break;
            case  4:
                break;
            default:
                break;


        }
    }


    private boolean isCustomerPresent() {
        boolean isUserExist = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account No. ");
        String accNo = scanner.nextLine();
        System.out.println("Enter password ");
        String password = scanner.nextLine();
        for (Customer customer : customerList) {
            if (customer.getAccNo().equals(accNo) && customer.getPassWord().equals(password)) {
                System.out.println("User present");
                currLoginUser = customer;
                isUserExist = true;
                break;
            }
        }
        if (!isUserExist) {
            System.out.println(" Sorry! , User not present, please create the account first");
        }
        return isUserExist;
    }

    private boolean isEmployeePresent() {
        boolean isUserExist = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account No. ");
        String accNo = scanner.nextLine();
        System.out.println("Enter password ");
        String password = scanner.nextLine();
        for (Employee employee : employeeList) {
            if (employee.getAccNo().equals(accNo) && employee.getPassWord().equals(password)) {
                System.out.println("Employee present");
                currLoginUser1 = employee;
                isUserExist = true;
                break;
            }
        }
        if (!isUserExist) {
            System.out.println(" Sorry! , User not present, please create the account first");
        }
        return isUserExist;
    }

}




