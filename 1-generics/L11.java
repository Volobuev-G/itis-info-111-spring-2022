// Подумайте:
// - что может пойти не так?
// - где программист, использующий этот
//   код, может ошибиться?
// - когда этот подход не работает, как
//   ожидается?
// и прочие способы вызвать недоумение
// у пользователя

// Класс для пары значений
class Pair<U,V> {
    private U first;
    private V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst()  { return first; }
    public V getSecond() { return second; }

    public void setFirst(U first)   { this.first = first; }
    public void setSecond(V second) { this.second = second; }
}

public class L11 {
    public static void main(String[] args) {
        // Входной массив
        Integer[] a = {1,2,3,4,5,4,3,2,1};

        // Поиск среднего, минимума и максимума
        Pair<Double,Pair<Integer,Integer>> ans = new Pair<>(0.0, new Pair<>(1001,-1001));
        for (Integer x : a) {
            if (x < ans.getSecond().getFirst()) {
                ans.getSecond().setFirst(x);
            }
            if (x > ans.getSecond().getSecond()) {
                ans.getSecond().setSecond(x);
            }
            ans.setFirst(ans.getFirst() + x);
        }
        ans.setFirst(ans.getFirst() / a.length);

        // Выводим ответы
        System.out.println(ans.getFirst());
        System.out.println(ans.getSecond().getFirst());
        System.out.println(ans.getSecond().getSecond());
    }
}
