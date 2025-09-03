public class PostgraduateStudent extends Student {
    String thesisTitle;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String thesisTitle) {
        super(rollNumber, name, cgpa);
        this.thesisTitle = thesisTitle;
    }

    public void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + getCgpa() + ", Thesis: " + thesisTitle);
    }
}
