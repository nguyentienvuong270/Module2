package TaiKhoan;

public class TaiKhoanThanhToan extends TaiKhoanNganHang {
    private String soThe;
    private double soTien;

    public TaiKhoanThanhToan(int id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTao,
                             String soThe, double soTien) {
        super(id, maTaiKhoan, tenChuTaiKhoan, ngayTao);
        this.soThe = soThe;
        this.soTien = soTien;
    }

    @Override
    public String toCsvString() {
        return id + "," + maTaiKhoan + "," + tenChuTaiKhoan + "," + ngayTao + ","
                + soThe + "," + soTien;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{id=" + id + ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", tenChuTaiKhoan='" + tenChuTaiKhoan + '\'' +
                ", ngayTao='" + ngayTao + '\'' +
                ", soThe='" + soThe + '\'' +
                ", soTien=" + soTien + "}";
    }
}
