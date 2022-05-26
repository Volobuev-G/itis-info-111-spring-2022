import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Volobuev\\Documents\\input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        String c = reader.readLine();
        int[] arr = tableSize(c);
        int n = arr[0];
        int m = arr[1];
        int wordsAmount = n * m;
        List<String> list = new ArrayList<>(wordsAmount);
        for (int i = 0;i < wordsAmount;i++) {
            list.add(reader.readLine());
        }
        List<Integer> wordsLength = new ArrayList<>(m);
        for (int i = 0;i < list.size();i++) {
            if (i + m < list.size()) {
                wordsLength.add(maxLength(list.get(i),list.get(i + m)));
            }
        }
        tablePrint(list,wordsLength,n,m);
    }
    public static void tablePrint(List<String> list,List<Integer> wordsLength,int n,int m) {
        for (int i = 0;i < n + 1;i++) {
            for (int j = 0;j < m + 1;j++) {
                System.out.print("+");
                System.out.print(repeatChar('-',wordsLength.get(j)));
            }
            System.out.print("+");
            System.out.println();
            System.out.print('|' + list.get(i) + '|');
        }

    }
    public static void tablePrintChars() {
        System.out.println("^\\+\\-(5)");
    }
    public static String repeatChar(char c, int length) {
        char[] data = new char[length];
        Arrays.fill(data, c);
        return new String(data);
    }
    public static int[] tableSize(String string) {
        String[] array = string.split(" ");
        int[] arr = new int[2];
        arr[0] = Integer.parseInt(array[0]);
        arr[1] = Integer.parseInt(array[1]);
        return arr;
    }
    public static int maxLength(String a, String b) {
        if (a.length() > b.length()) {
            return a.length();
        } else {
            return b.length();
        }
    }
}