package on_tap3;

public interface Manager {
    public abstract void add();
    void delete(int id);
    String[] getAll();
    //...
}


// 1 cách khai khai báo cho 1 tập các hàm sử dụng cho một mục đích gì đó
// Sử dụng khi bạn cần định nghĩa 1 tập các tính cho các class không có nhiều liên hệ với nhau sử dụng (can - do)
// Hỗ trợ đa triển khai