import java.util.*;


public class LearnQueue {
    public static void main(String[] args) {
        Queue<Person> que = new LinkedList<>();
        que.add(new Person("Alex", 21));
        que.add(new Person("Harry", 20));

        System.out.println(que.peek()); // first one in
        System.out.println(que.poll()); // it is like pop first one
        System.out.println(que.peek());
    }

    static record Person(String name, int age){}
}
