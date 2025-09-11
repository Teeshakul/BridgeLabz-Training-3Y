import java.util.*;
class Customer {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalances() {
        System.out.println("Customer: " + name);
        for (Account acc : accounts) {
            System.out.println("  Account " + acc.getAccountNumber() + " Balance: " + acc.getBalance());
        }
    }
}