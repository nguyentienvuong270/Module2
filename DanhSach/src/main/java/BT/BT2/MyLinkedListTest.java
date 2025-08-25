package BT.BT2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.add(1, 15);

        System.out.println("Danh sách sau khi thêm:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Xóa phần tử
        list.remove((Object)20);
        System.out.println("Sau khi xóa 20:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Test contains & indexOf
        System.out.println("Danh sách có chứa 30 không? " + list.contains(30));
        System.out.println("Vị trí của 30: " + list.indexOf(30));

        // Clone
        MyLinkedList<Integer> cloneList = list.clone();
        System.out.println("Danh sách clone:");
        for (int i = 0; i < cloneList.size(); i++) {
            System.out.print(cloneList.get(i) + " ");
        }
        System.out.println();

        // Lấy first & last
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
    }

}
