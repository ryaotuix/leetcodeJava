package learn;

import java.util.*;

public class LearnLinkedList {
    public static void main(String[] args) {
        LinkedList<Person> ll = new LinkedList<>();
        ll.add(new Person("Alex", 21));
        ll.add(new Person("Harry", 20));
        ll.add(1, new Person("Sam", 19));

        ListIterator<Person> personIterator = ll.listIterator();
        while (personIterator.hasNext()){
            System.out.println(personIterator.next());
        }
        System.out.println();
        while (personIterator.hasPrevious()) {
            System.out.println(personIterator.previous());
        }
    }
    static record Person(String name, int age){}

}
