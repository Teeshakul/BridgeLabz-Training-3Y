import java.util.*;

public class RockPaperScissors {
    static String[] choices={"rock","paper","scissors"};
    public static String computerChoice() {
        return choices[new Random().nextInt(3)];
    }
    public static String winner(String user,String comp) {
        if(user.equals(comp)) return "draw";
        if(user.equals("rock")&&comp.equals("scissors")||user.equals("paper")&&comp.equals("rock")||user.equals("scissors")&&comp.equals("paper"))
            return "user";
        return "comp";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int games=sc.nextInt();
        int uw=0,cw=0;
        for(int i=0;i<games;i++) {
            String user=sc.next();
            String comp=computerChoice();
            String w=winner(user,comp);
            if(w.equals("user")) uw++; else if(w.equals("comp")) cw++;
            System.out.println("User:"+user+" Comp:"+comp+" Winner:"+w);
        }
        System.out.println("User Wins: "+uw+" Comp Wins: "+cw);
        System.out.println("User %:"+(uw*100.0/games)+" Comp %:"+(cw*100.0/games));
        sc.close();
    }
}
