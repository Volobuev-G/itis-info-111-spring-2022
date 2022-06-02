
class MyThread1 extends Thread {
    private int x;
    public MyThread1(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(x*1000);
        } catch (InterruptedException e) {}
        System.out.println(x);
    }
}

public class L15 {
    public static void timeSort(int[] a) {
        for (int x : a) {
            MyThread1 t = new MyThread1(x);
            t.start();
        }
    }
    public static void main(String[] args) {
        int[] a = new int[]{5,3,8,2};
        timeSort(a);
    }
}
