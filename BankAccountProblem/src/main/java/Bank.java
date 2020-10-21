import java.util.List;

public class Bank {
    String name;
    List<Transaction> transactions;
    List<BankAccount> accounts;

    public Bank(){
        this.name = "Wells Fargo";
    }

    public List<BankAccount> addNewBankAccount(BankAccount b){
        accounts.add(b);
        return accounts;
    }

    public List<Transaction> addNewTransaction(Transaction t){
        transactions.add(t);
        return transactions;
    }

    public String getName(){
        return this.name;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}
