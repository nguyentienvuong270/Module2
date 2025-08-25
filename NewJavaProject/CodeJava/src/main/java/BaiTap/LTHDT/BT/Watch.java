package BaiTap.LTHDT.BT;

public class Watch {
    public static void main(String[] args) {
        StopWatch s = new StopWatch();
        s.setStartTime();
        long a = 0;
        for (int i = 0; i < 10000; i++) {
            a++;
            a = a - i;
        }
        s.setEndTime();
        long time = s.setElapsedTime();
        System.out.println(time);
    }
}
