import java.util.*;

public class LearnLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        System.out.println(colors.size());
        System.out.println(colors.contains("red"));
        System.out.println(colors.contains("purple"));
        System.out.println(colors);

        // 1) smart loop
        for (String color: colors) {
            System.out.println(color);
        }

        // 2) different way
        colors.forEach(System.out::println);

    }
}
