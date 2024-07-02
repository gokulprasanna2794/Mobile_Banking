package basic.mobile;

public class DebitCard implements PaymentMethod {
    private String accountNumber;
    private String accountHolder;
    private String cardNumber;
    private String cardPin;

    public DebitCard(String accountNumber, String accountHolder, String cardNumber, String cardPin) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
    }

    public boolean withdraw(Account account, double amount, String enteredPin) {
        if (!enteredPin.equals(cardPin)) {
            System.out.println("Incorrect PIN.");
            return false;
        }
        if (amount > account.getAccountBalance()) {
            System.out.println("Insufficient balance.");
            return false;
        }
        account.setAccountBalance(account.getAccountBalance() - amount);
        System.out.println("Withdrawal successful. New balance: " + account.getAccountBalance());
        return true;
    }

    @Override
    public boolean makePayment(double amount) {

        return false;
    }
}