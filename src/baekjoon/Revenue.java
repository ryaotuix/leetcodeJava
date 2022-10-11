package baekjoon;
// #1712번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Revenue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);


        // 손익분기점 존재 X
        if (C<=B) {
            System.out.println("-1");
        }
        else {
            int margin = A/(C-B); // 알아서 낮춰주거나 자연수

            System.out.println(margin+1);
        }
    }
}
