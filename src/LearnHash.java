import java.util.*;

public class LearnHash {
    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Jamila"), new Diamond("Great Diamond"));


        System.out.println(new Person("Jamila").hashCode());
        System.out.println(new Person("Jamila").hashCode());
        // two objects are going to be the same

        System.out.println(map.get(new Person("Jamila")));
    }

    private static void maps() {
        Map<Integer, LearnMap.Person> map = new HashMap<>();
        map.put(1, new LearnMap.Person("Alex"));
        map.put(2, new LearnMap.Person("Alexa"));
        map.put(3, new LearnMap.Person("Mary"));
        map.put(2, new LearnMap.Person("Sexy")); // REPLACE

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(3)); // Person[name=Alex]
        System.out.println(map.containsKey(4)); // false
        System.out.println(map.keySet()); // [1, 2, 3]
        System.out.println(map.entrySet()); // [1=Person[name=Alex], 2=Person[name=Sexy], 3=Person[name=Mary]]
        map.remove(3);


        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });

        System.out.println(map.getOrDefault(3, new LearnMap.Person("default")));
        System.out.println(map.values());
    }

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        // This is necessary for hashcoding
        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

    }

    record Diamond(String name){}
}
