package baekjoon;

import java.util.*;

public class OverAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr;

        int cases = in.nextInt();

        for (int i = 0; i< cases; i++) {
            int students = in.nextInt();
            //System.out.printf("number of students for case [%d]: %d\n", i+1, students);
            arr = new int[students];

            double sum = 0;

            // get sum and scores
            for (int j=0; j<students; j++) {
                int score = in.nextInt();
                arr[j] = score;
                sum += score;
                //System.out.printf("[%d] score : %d\n", j+1, score);
            }

            double mean = (sum/students);
            double overAvg = 0;

            for (int j = 0; j<students; j++) {
                if(arr[j] > mean) {
                    overAvg++;
                }
            }

            System.out.printf("%.3f%%\n", (overAvg/students)*100);
        }
        in.close();
    }


}
