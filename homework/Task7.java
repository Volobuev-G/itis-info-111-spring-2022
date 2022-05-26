import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(3);
        list.add(8);
        System.out.println(divisible(n,list));
    }
    public static Map<Integer, List<Integer>> divisible(int n, List<Integer> numbers) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i < n;i++) {
            for (int k = 0;k < numbers.size();k++) {
                if (numbers.get(k) % n == i) {
                    list.add(k);
                }
            }
            map.put(i,list);
            list.clear();
        }
        return map;

    }
}
