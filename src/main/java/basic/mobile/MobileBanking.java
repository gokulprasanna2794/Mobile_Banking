package basic.mobile;

public class MobileBanking {
    public static void main(String[] args) {
        Account account = new Account("123456789", 5000.00, "Gokul");

        DebitCard debitCard = new DebitCard("123456789", "Gokul", "987654321", "12345");
        debitCard.withdraw(account, 10000.00, "1234");

        GPay gPay = new GPay("12345678", "Gokul", "4321", "Gokul");
        gPay.payBills("Prasanna", 1500.00, "Utility", "4321");
        System.out.println("Balance Illa p");
    }
}
