import java.time.LocalDate;

public class Transaction {
    int payer;
    int payee;
    double payerBalance;
    double payeeBalance;
    double amount;
    String bank;
    LocalDate date;

    public Transaction(BankAccount payer, BankAccount payee, double amount, LocalDate date){
        this.payer = payer.accountNumber;
        this.payee = payee.accountNumber;
        this.payerBalance = payee.balance;
        this.payeeBalance = payee.balance;
        this.amount = amount;
        this.date = LocalDate.now();
        this.bank = "Wells Fargo";
    }

    public int getPayer() {
        return payer;
    }

    public int getPayee() {
        return payee;
    }

    public double getPayerBalance() {
        return payerBalance;
    }

    public double getPayeeBalance() {
        return payeeBalance;
    }

    public double getAmount() {
        return amount;
    }

    public String getBank() {
        return bank;
    }

    public LocalDate getDate() {
        return date;
    }

}
