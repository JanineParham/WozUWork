public class BankAccount {
    int accountNumber;
    String name;
    double balance;
    String bank;

    public BankAccount(int accountNumber, String name, double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.bank = "Wells Fargo";
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

}
