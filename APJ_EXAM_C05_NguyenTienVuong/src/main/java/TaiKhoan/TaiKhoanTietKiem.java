package TaiKhoan;

public class TaiKhoanTietKiem extends TaiKhoanNganHang{
    private double soTienGui;
    private String ngayGui;
    private double laiSuat;
    private int kyHan;

    public TaiKhoanTietKiem(int id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTao,
                            double soTienGui, String ngayGui, double laiSuat, int kyHan) {
        super(id, maTaiKhoan, tenChuTaiKhoan, ngayTao);
        this.soTienGui = soTienGui;
        this.ngayGui = ngayGui;
        this.laiSuat = laiSuat;
        this.kyHan = kyHan;
    }

    @Override
    public String toCsvString() {
        return id + "," + maTaiKhoan + "," + tenChuTaiKhoan + "," + ngayTao + ","
                + soTienGui + "," + ngayGui + "," + laiSuat + "," + kyHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem \n{id=" + id + ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", tenChuTaiKhoan='" + tenChuTaiKhoan + '\'' +
                ", ngayTao='" + ngayTao + '\'' +
                ", soTienGui=" + soTienGui +
                ", ngayGui='" + ngayGui + '\'' +
                ", laiSuat=" + laiSuat +
                ", kyHan=" + kyHan + " thang}";
    }
}
