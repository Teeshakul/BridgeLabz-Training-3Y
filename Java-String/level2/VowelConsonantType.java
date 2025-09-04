import java.util.*;

public class VowelConsonantType {
    public static String type(char c) {
        if (!Character.isLetter(c)) return "Not a Letter";
        c=Character.toLowerCase(c);
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')?"Vowel":"Consonant";
    }
    public static String[][] analyze(String text) {
        String[][] arr=new String[text.length()][2];
        for (int i=0;i<text.length();i++) {
            arr[i][0]=String.valueOf(text.charAt(i));
            arr[i][1]=type(text.charAt(i));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[][] result=analyze(text);
        for (String[] r:result) System.out.println(r[0]+" - "+r[1]);
        sc.close();
    }
}
