package basic.mobile;
public class Account {
    private String accountNumber;
    private double accountBalance;
    private String accountHolder;

    public Account(String accountNumber, double accountBalance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}