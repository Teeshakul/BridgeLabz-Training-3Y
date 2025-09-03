public class CircleMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);

        System.out.println("Default Circle Area: " + c1.area());
        System.out.println("Custom Circle Area: " + c2.area());
    }
}

