
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        Account acc1 = bank.openAccount(c1);
        acc1.deposit(500);

        Account acc2 = bank.openAccount(c1);
        acc2.deposit(1000);

        Account acc3 = bank.openAccount(c2);
        acc3.deposit(750);

        c1.viewBalances();
        c2.viewBalances();
    }
}