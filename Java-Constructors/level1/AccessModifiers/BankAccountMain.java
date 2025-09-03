public class BankAccountMain {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("123456", "Alice", 5000, 4.5);
        sa.deposit(2000);
        sa.withdraw(1000);
        sa.display();
    }
}
