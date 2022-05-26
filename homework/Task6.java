import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n) {
        boolean prime;
        List<Integer> list = new ArrayList<>();
        list = Stream.iterate(2,x -> x + 1).limit(n-1).toList();
        List<Integer> list1 = new ArrayList<>();
        list1 = list.stream().filter(x -> n % x == 0).toList();
        prime = list1.size() < 2;
        return prime;
    }
}
