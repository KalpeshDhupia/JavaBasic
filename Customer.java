public class Customer {
    private double balance;
    private String accNo;
    private String accName;
    private String passWord;
    private String role;

    public void depositAmt(double amt) {
        balance += amt;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void showBal() {
        System.out.println("Total balance is " + balance);
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withDrawAmt(double drawAmt) {
        if (drawAmt > balance) {
            System.out.println("Not sufficient balance to withdraw");
        } else {
            balance = balance - drawAmt;
        }
    }

    public void transferFunds(double transferAmt, String accNo){
        if(transferAmt > balance){
            System.out.println("Not sufficient balance to transfer");
        }
        else {
            balance = balance - transferAmt;
            System.out.println("Amount successfully transfered to "+accNo);
        }
    }

}
