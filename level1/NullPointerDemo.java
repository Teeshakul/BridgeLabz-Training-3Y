public class NullPointerDemo {
    public static void generate() {
        String text = null;
        System.out.println(text.length());
    }
    public static void handle() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }
    }
    public static void main(String[] args) {
        // generate(); // uncomment to see abrupt stop
        handle();
    }
}
