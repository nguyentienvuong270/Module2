package org.example;

public class XuatHang {
    private String tenSP;
    private int soLuong;
    private double donGia;

    public XuatHang(String tenSP, int soLuong, double donGia) {
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return soLuong * donGia;
    }

    @Override
    public String toString() {
        return String.format("Ten: %s | SL: %d | Don Gia: %.2f | Thanh tien: %.2f",
                tenSP, soLuong, donGia, getThanhTien());
    }
}
