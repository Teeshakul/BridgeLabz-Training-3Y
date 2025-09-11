class Account {
    private static int counter = 1000;
    private int accountNumber;
    private double balance;

    public Account() {
        this.accountNumber = counter++;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
