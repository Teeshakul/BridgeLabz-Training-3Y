import java.util.*;

public class VotingEligibility {
    public static int[] randomAges(int n) {
        int[] arr=new int[n];
        Random r=new Random();
        for(int i=0;i<n;i++) arr[i]=r.nextInt(90)+10;
        return arr;
    }
    public static String[][] canVote(int[] ages) {
        String[][] res=new String[ages.length][2];
        for(int i=0;i<ages.length;i++) {
            res[i][0]=String.valueOf(ages[i]);
            res[i][1]=(ages[i]>=18)?"true":"false";
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=10;
        int[] ages=randomAges(n);
        String[][] result=canVote(ages);
        System.out.println("Age\tCanVote");
        for(String[] r:result) System.out.println(r[0]+"\t"+r[1]);
        sc.close();
    }
}
