package basic.mobile;
public class GPay implements PaymentMethod {
    private String accountNumber;
    private String accountHolder;
    private String upiPin;
    private String username;

    public GPay(String accountNumber, String accountHolder, String upiPin, String username) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.upiPin = upiPin;
        this.username = username;
    }

    public boolean payBills(String billerName, double billedAmount, String billerType, String enteredUpiPin) {
        if (!enteredUpiPin.equals(upiPin)) {
            System.out.println("Incorrect UPI PIN.");
            return false;
        }
        System.out.println("Bill payment successful.");
        System.out.println("Biller Name: " + billerName);
        System.out.println("Billed Amount: " + billedAmount);
        System.out.println("Biller Type: " + billerType);
        return true;
    }

    @Override
    public boolean makePayment(double amount) {

        return false;
    }
}
