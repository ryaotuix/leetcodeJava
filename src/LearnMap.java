import java.util.*;

public class LearnMap {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Mary"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1)); // Person[name=Alex]
        System.out.println(map.containsKey(4)); // false
        System.out.println(map.keySet()); // [1, 2, 3]
        System.out.println(map.entrySet()); // [1=Person[name=Alex], 2=Person[name=Alexa], 3=Person[name=Mary]]
        map.remove(3);


        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });

        System.out.println(map.getOrDefault(3, new Person("default")));
        System.out.println(map.values());
    }

    record Person(String name){}
}
