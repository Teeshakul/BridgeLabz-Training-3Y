class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public Account openAccount(Customer customer) {
        Account acc = new Account();
        customer.addAccount(acc);
        return acc;
    }
}