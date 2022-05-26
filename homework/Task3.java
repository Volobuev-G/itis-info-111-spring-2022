import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(task(list));
    }
    public static List<Integer> task(List<Integer> list) {
        return list.stream().filter(x -> x % 2 != 0)
                .flatMap(x -> Stream.of(x , x))
                .collect(Collectors.toList());
    }
}
