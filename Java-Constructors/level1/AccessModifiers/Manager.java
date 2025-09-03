public class Manager extends Employee {
    String team;

    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void display() {
        System.out.println("ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary() + ", Team: " + team);
    }
}
