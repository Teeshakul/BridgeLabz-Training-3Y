package CompanyComposition;
import java.util.*;
class Company {
    private String name;
    private ArrayList<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void show() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.show();
        }
    }
}