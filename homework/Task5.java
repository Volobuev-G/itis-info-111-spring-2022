import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(task(n));
    }
    public static List<Double> task(int n) {
        List <Integer> intlist = Stream.generate(() -> new Random().nextInt(1, 1000)).limit(n).toList();
        System.out.println(intlist);
        List<Double> doublelist = new ArrayList<>();
        doublelist.add(intlist.stream().reduce(Integer::sum).map(x -> (double) x/(double) n).get());
        Double second = intlist.stream().map(x -> x * x).reduce(Integer::sum).map(x -> (double) x/(double) n).get();
        doublelist.add(second - Math.pow(doublelist.get(0),2));
        return doublelist;
    }
}
