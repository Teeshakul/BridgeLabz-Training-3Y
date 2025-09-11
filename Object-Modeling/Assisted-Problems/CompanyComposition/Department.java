package CompanyComposition;
import java.util.*;
class Department {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    public void show() {
        System.out.println("  Department: " + name);
        for (Employee e : employees) {
            e.show();
        }
    }
}