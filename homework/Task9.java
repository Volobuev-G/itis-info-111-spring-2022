import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
class Cars {
    String company;
    String model;
    int year;
    String color;
    String place;
    String date;
    int sum;

}
public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Volobuev\\Documents\\input1.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        List<Cars> list = new ArrayList<>();
        reader.readLine().split("\s*");
    }
}
