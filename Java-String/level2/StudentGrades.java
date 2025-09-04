import java.util.*;

public class StudentGrades {
    public static int[][] scores(int n) {
        Random r=new Random();
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++) for(int j=0;j<3;j++) arr[i][j]=r.nextInt(41)+60;
        return arr;
    }
    public static double[][] results(int[][] scores) {
        int n=scores.length;
        double[][] res=new double[n][4];
        for(int i=0;i<n;i++) {
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double avg=total/3.0;
            double perc=total/3.0;
            res[i][0]=total; res[i][1]=avg; res[i][2]=perc;
        }
        return res;
    }
    public static String grade(double perc) {
        if(perc>=90) return "A";
        if(perc>=75) return "B";
        if(perc>=60) return "C";
        if(perc>=40) return "D";
        return "F";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int[][] s=scores(n);
        double[][] res=results(s);
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPerc\tGrade");
        for(int i=0;i<n;i++) {
            System.out.print(s[i][0]+"\t"+s[i][1]+"\t"+s[i][2]+"\t");
            System.out.print((int)res[i][0]+"\t"+String.format("%.2f",res[i][1])+"\t"+String.format("%.2f",res[i][2])+"\t");
            System.out.println(grade(res[i][2]));
        }
        sc.close();
    }
}
