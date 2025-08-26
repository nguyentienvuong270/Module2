package TaiKhoan;

public abstract class TaiKhoanNganHang {
    protected int id;
    protected String maTaiKhoan;
    protected String tenChuTaiKhoan;
    protected String ngayTao;

    public TaiKhoanNganHang(int id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTao) {
        this.id = id;
        this.maTaiKhoan = maTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.ngayTao = ngayTao;
    }

    public int getId() { return id; }

    public String getMaTaiKhoan() { return maTaiKhoan; }

    public abstract String toCsvString();

    public String getTenChuTaiKhoan() {
        return tenChuTaiKhoan;
    }

    @Override
    public abstract String toString();
}

