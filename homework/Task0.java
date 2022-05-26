import java.util.ArrayList;
import java.util.List;


public class Task0 {
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
    public static int task(List<Integer> list) {
        return list.stream().filter(x -> x % 2 == 0).reduce(Integer::sum).get();
    }
}
