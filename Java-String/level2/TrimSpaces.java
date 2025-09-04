import java.util.*;

public class TrimSpaces {
    public static String trimManual(String text) {
        int start=0,end=text.length()-1;
        while(start<=end && text.charAt(start)==' ') start++;
        while(end>=start && text.charAt(end)==' ') end--;
        String res="";
        for(int i=start;i<=end;i++) res+=text.charAt(i);
        return res;
    }
    public static boolean compare(String a,String b) {
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++) if(a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String manual=trimManual(text);
        String builtin=text.trim();
        System.out.println("Equal: "+compare(manual,builtin));
        sc.close();
    }
}
