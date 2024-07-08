package DSAquestions;
import java.util.*;

public class sortCharFreq {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(map);

        ArrayList<Integer> list = new ArrayList<>(map.values());
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        StringBuilder sb = new StringBuilder();
        Set<Character> used = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            int idx = list.get(i);
            System.out.println(idx);
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == idx && !used.contains(entry.getKey())) {
                    char key = entry.getKey();
                    for (int j = 0; j < idx; j++) {
                        sb.append(key);
                    }
                    used.add(key);
                    break;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
