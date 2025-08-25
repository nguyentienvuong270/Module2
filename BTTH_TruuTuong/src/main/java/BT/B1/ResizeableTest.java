package BT.B1;

public abstract class ResizeableTest {
    public static void main(String[] args) {

            System.out.println("Kiểm thử giao diện Resizeable...");

            ResizeableTest obj = new ResizeableTest() {
                @Override
                public void resize(double percent) {
                    System.out.println("Đang thay đổi kích thước với " + percent + "%");
                }
            };

            obj.resize(50);
        }

    public abstract void resize(double percent);
}
