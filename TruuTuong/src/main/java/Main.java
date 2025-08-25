import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.remove(0);
        a.set(0, 121);

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hẹ");

        Demo<Integer> b = new Demo<>();
        b.t = 1;
        b.add(2);

        Demo<String> c = new Demo<>();
        c.t = "Hẹ hekk";
        c.add("Một");
    }
}