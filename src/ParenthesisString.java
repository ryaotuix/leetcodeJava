import java.util.*;

public class ParenthesisString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numlines = in.nextInt();
        for (int i =0; i<numlines; i++) {
            System.out.println(solve(in.next()));
        }

    }

    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i =0; i<s.length(); i++) {
            char c = s.charAt(i);

            // if it is '('
            if (c == '(') {
                stack.push(c);
            }
            // followings are when it is ')'
            else if (stack.empty()) {
                return "NO";
            }
            else {
                stack.pop();
            }
        }

        // after all loop
        if (stack.empty()) {
            return "YES";
        }
        return "NO";

    }
}
