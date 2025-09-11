package CompanyComposition;
public class Main {
    public static void main(String[] args) {
        Company comp = new Company("Tech Corp");

        Department d1 = new Department("IT");
        d1.addEmployee("Alice");
        d1.addEmployee("Bob");

        Department d2 = new Department("HR");
        d2.addEmployee("Charlie");

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.show();
    }
}
