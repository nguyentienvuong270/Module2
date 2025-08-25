package org.example;

import java.security.SecureRandom;

public class SanPham {
    private static int id = 1;
    private int maSP;
    private String tenSP;
    private String loaiSP;
    private double giaSP;
    private int soLuong;

    public SanPham(String tenSP, String loaiSP, double giaSP, int soLuong) {
        this.maSP = id++;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.giaSP = giaSP;
        this.soLuong = soLuong;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "Ma SP: " + this.maSP +  ". Ten SP: " + this.tenSP + ". Loai SP: " + this.loaiSP + ". So luong SP: " + this.soLuong + ". Gia SP: " + this.giaSP +"$";
    }
}


