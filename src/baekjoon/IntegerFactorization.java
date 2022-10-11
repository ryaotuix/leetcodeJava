package baekjoon;
// # 11653
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class IntegerFactorization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i=2; i<=num; i++) { // <= for the case of 2 and others
            while(num%i == 0) {
                System.out.println(i);
                num /=i;
            }
        }
        
    }
}
