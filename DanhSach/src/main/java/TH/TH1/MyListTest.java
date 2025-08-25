package TH.TH1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("Phần tử ở vị trí 4: " + listInteger.get(4));
        System.out.println("Phần tử ở vị trí 1: " + listInteger.get(1));
        System.out.println("Phần tử ở vị trí 2: " + listInteger.get(2));

        // Trường hợp vượt quá kích thước danh sách
        try {
            System.out.println("Phần tử ở vị trí 6: " + listInteger.get(6));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Lỗi khi truy cập phần tử: " + e.getMessage());
        }
    }
}
