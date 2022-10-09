import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

// Let's use Hashmap
public class Pokemon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); // how many pokemon to put in hashmap
        int m = Integer.parseInt(input[1]); // how many to find from hashmap

        Map<Integer, String> pokeDex = new HashMap<>();
        // Map key = Integer, value = Pokemon name
        Map<String, Integer> pokeDex2 = new HashMap<>();
        // Map key = pokemon name, value = integer

        for (int i = 1; i < n+1; i++) {
            String pokemon = br.readLine();
            pokeDex.put(i, pokemon);
            pokeDex2.put(pokemon, i);// put it to hashmap
        }

        StringBuilder sb = new StringBuilder(); // save string to print later

        for (int i = 0; i < m; i++) {
            String question = br.readLine();
            // 1) if this is a number
            if (isNum(question)) {
                sb.append(pokeDex.get(Integer.parseInt(question)) + "\n");
            }
            // 2) if this is a string
            else {
                sb.append(pokeDex2.get(question) + "\n");
            }
        }

        System.out.println(sb);

    }

    public static boolean isNum(String str) {
        for (int i=0; i<str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

//    public static <T, E> T getKeysByValue(Map<T, E> map, E value) {
//
//        return map.keySet()
//                .stream()
//                .filter(key -> value.equals(map.get(key)))
//                .findFirst().get();
//    }
}
