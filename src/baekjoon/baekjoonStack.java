package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// #10828
class MyStack {
    private ArrayList<Integer> stack;
    private int top;

    MyStack(ArrayList<Integer> stack, int top) {
        this.stack = stack;
        this.top = top;
    }

    public void push(int val) {
        top++;
        this.stack.add(val);
    }

    public int top() {
        if (stack.size()== 0) {
            return -1;
        }
        return stack.get(top);
    }

    public int size() {
        return stack.size();
    }

    public int empty() {
        if (stack.size()== 0) {
            return 1;
        }
        return 0;
    }

    public int pop() {
        if (stack.size() == 0) {
            return -1;
        }
        else {
            int res = stack.get(top);
            stack.remove(top);
            top--;
            return res;
        }

    }

    public void print() {
        System.out.println(stack);
    }



}
public class baekjoonStack {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrStack = new ArrayList<>();
        int top = -1; // start with -1

        MyStack stack = new MyStack(arrStack, top);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i =0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    int toPush = Integer.parseInt(st.nextToken());
                    stack.push(toPush);
//                    stack.print();
                    break;

                case "pop":
                    int p = stack.pop();
                    sb.append(p);
                    sb.append("\n");
//                    stack.print();
                    break;

                case "size":
                    sb.append(stack.size());
                    sb.append("\n");
//                    System.out.println(stack.size());
                    break;

                case "empty":
                    sb.append(stack.empty());
                    sb.append("\n");
//                    System.out.println(stack.empty());
                    break;

                case "top":
                    sb.append(stack.top());
                    sb.append("\n");
//                    System.out.println(stack.top());
                    break;
            }

        }
        System.out.println(sb);

    }
}


