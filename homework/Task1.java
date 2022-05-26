import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Function<Integer,Integer> f = x -> x + 1;
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        System.out.println(task(intList,f));
        List<String> stringList = new ArrayList<>();
        Function<String,Integer> f1 = String::length;
        stringList.add("a");
        stringList.add("bc");
        stringList.add("def");
        System.out.println(task(stringList,f1));
    }
    public static <T> int task(List<T> list, Function<T, Integer> f) {
        return list.stream().map(f).filter(x -> x % 2 != 0).toList().size();
    }
}
