//package leetcode;
//
//import java.util.*;
//
//class Pair implements Comparable<Pair> {
//    private int value;     // element 1
//    private int index;     // element 2
//
//    Pair(int value, int index) {
//        this.value = value;
//        this.index = index;
//    }
//
//    public int getValue() {
//        return this.value;
//    }
//
//    public int getIndex() {
//        return this.index;
//    }
//
//    @Override
//    public int compareTo(Pair o) {
//        return 0;
//    }
//}
//
//public class TaskCompletion {
//    public static void main(String[] args) {
//        List<Integer> reward_1 = new ArrayList<>(Arrays.asList(5,4,3,2,1));
//        List<Integer> reward_2 = new ArrayList<>(Arrays.asList(100,80,5,4,1));
//
//        getMax(1, reward_1, reward_2);
//    }
//
//    public static int getMax(int k, List<Integer> reward_1, List<Integer> reward_2) {
//        PriorityQueue<Pair> pq = new PriorityQueue<>();
//
//
//        for (int i=0; i< reward_1.size(); i++) {
//            int dif = reward_1.get(i) - reward_2.get(i);
//            Pair p = new Pair(dif, i);
//            pq.add(p);
//        }
//
//        while(!pq.isEmpty()){
//            Pair cur = pq.peek();
//            pq.poll();
//            System.out.println(cur.getIndex());
//        }
//        //System.out.println(pq.peek());
//        // index is going to be 0,1,2,3,...
//
//        return 0;
//    }
//}
