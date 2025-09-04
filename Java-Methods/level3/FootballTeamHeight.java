import java.util.Random;

public class FootballTeamHeight {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random r = new Random();
        for (int i = 0; i < heights.length; i++) heights[i] = 150 + r.nextInt(101);
        int sum = 0, min = heights[0], max = heights[0];
        for (int h : heights) {
            sum += h;
            if (h < min) min = h;
            if (h > max) max = h;
        }
        double mean = sum / (double) heights.length;
        System.out.println("Shortest: " + min);
        System.out.println("Tallest: " + max);
        System.out.println("Mean: " + mean);
    }
}
