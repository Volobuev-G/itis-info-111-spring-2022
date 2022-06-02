
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) throws IOException{
        Path path = Path.of("C:\\Users\\Volobuev\\Documents\\GitHub\\itis-info-111-spring-2022");
        StringSummary(path);

    }
    public static void StringSummary (Path path) throws IOException {
        Map<String,Integer> map = new HashMap<>();
        List<String> files = new ArrayList<>();
        files = Files.walk(path)
                .filter(Files::isRegularFile)
                .filter(file -> file.getFileName().toString().endsWith(".java"))
                .map(Path::toString)
                .collect(Collectors.toList());
        map = Files.walk(path)
                .filter(Files::isRegularFile)
                .filter(file -> file.getFileName().toString().endsWith(".java"))
                .collect(Collectors.toMap(Path::toString,file -> {
                    try {
                        return (int) Files.lines(file).count();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return 0;
                }));
        Set<String> set = map.keySet();
        List<String> list = set.stream().toList();
        for (int i = 0;i < map.size();i++) {
            String[] array = list.get(i).split("\\\\");
            String str = array[array.length - 1];
            map.put(str, map.remove(list.get(i)));
        }
        System.out.println(map);
    }
}
