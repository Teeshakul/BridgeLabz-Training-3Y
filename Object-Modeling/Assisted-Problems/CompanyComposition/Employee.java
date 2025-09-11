package CompanyComposition;
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("    Employee: " + name);
    }
}
