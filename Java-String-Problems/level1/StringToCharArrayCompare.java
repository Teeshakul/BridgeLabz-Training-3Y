import java.util.Scanner;

public class StringToCharArrayCompare {

    public static char[] getCharsFromString(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        char[] manualArray = getCharsFromString(text);
        char[] builtinArray = text.toCharArray();
        boolean comparison = compareCharArrays(manualArray, builtinArray);
        System.out.print("User-defined method result: ");
        for (char c : manualArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Built-in toCharArray() result: ");
        for (char c : builtinArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are both arrays equal? " + comparison);

        sc.close();
    }
}
