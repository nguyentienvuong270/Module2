package service;

import TaiKhoan.TaiKhoanNganHang;
import TaiKhoan.TaiKhoanThanhToan;
import TaiKhoan.TaiKhoanTietKiem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BankAccountService {
    private List<TaiKhoanNganHang> danhSachTaiKhoan = new ArrayList<>();
    private final String FILE_PATH = "src/main/java/dataBase/bank_accounts.csv";

    public BankAccountService() {
        docFile();
    }

    public void docFile() {
        danhSachTaiKhoan.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 8) {
                    // Tài khoản tiết kiệm
                    TaiKhoanTietKiem tk = new TaiKhoanTietKiem(
                            Integer.parseInt(parts[0]),
                            parts[1],
                            parts[2],
                            parts[3],
                            Double.parseDouble(parts[4]),
                            parts[5],
                            Double.parseDouble(parts[6]),
                            Integer.parseInt(parts[7])
                    );
                    danhSachTaiKhoan.add(tk);
                } else if (parts.length == 6) {
                    // Tài khoản thanh toán
                    TaiKhoanThanhToan tk = new TaiKhoanThanhToan(
                            Integer.parseInt(parts[0]),
                            parts[1],
                            parts[2],
                            parts[3],
                            parts[4],
                            Double.parseDouble(parts[5])
                    );
                    danhSachTaiKhoan.add(tk);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File du lieu chua ton tai, tao file moi.");
        } catch (IOException e) {
            System.out.println("Loi doc file: " + e.getMessage());
        }
    }

    public void ghiFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (TaiKhoanNganHang tk : danhSachTaiKhoan) {
                bw.write(tk.toCsvString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Loi ghi file: " + e.getMessage());
        }
    }

    public int layIdMax() {
        int max = 0;
        for (TaiKhoanNganHang tk : danhSachTaiKhoan) {
            if (tk.getId() > max) {
                max = tk.getId();
            }
        }
        return max;
    }

    public void themTaiKhoan(TaiKhoanNganHang tk) {
        danhSachTaiKhoan.add(tk);
        ghiFile();
    }

    public boolean xoaTaiKhoanTheoMa(String maTaiKhoan) {
        TaiKhoanNganHang found = null;
        for (TaiKhoanNganHang tk : danhSachTaiKhoan) {
            if (tk.getMaTaiKhoan().equalsIgnoreCase(maTaiKhoan)) {
                found = tk;
                break;
            }
        }
        if (found != null) {
            danhSachTaiKhoan.remove(found);
            ghiFile();
            return true;
        }
        return false;
    }

    public List<TaiKhoanNganHang> timKiem(String keyword) {
        List<TaiKhoanNganHang> ketQua = new ArrayList<>();
        String lowerKey = keyword.toLowerCase();
        for (TaiKhoanNganHang tk : danhSachTaiKhoan) {
            if (tk.getMaTaiKhoan().toLowerCase().contains(lowerKey) ||
                    tk.getTenChuTaiKhoan().toLowerCase().contains(lowerKey)) {
                ketQua.add(tk);
            }
        }
        return ketQua;
    }

    public List<TaiKhoanNganHang> getDanhSachTaiKhoan() {
        return danhSachTaiKhoan;
    }
}
