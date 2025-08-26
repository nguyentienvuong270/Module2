package Main;

import TaiKhoan.TaiKhoanNganHang;
import TaiKhoan.TaiKhoanThanhToan;
import TaiKhoan.TaiKhoanTietKiem;
import service.BankAccountService;
import service.ValidationService;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static BankAccountService service = new BankAccountService();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n---- QUAN LY NGAN HANG ----");
            System.out.println("1. Them tai khoan");
            System.out.println("2. Xoa tai khoan");
            System.out.println("3. Xem danh sach tai khoan");
            System.out.println("4. Tim kiem tai khoan");
            System.out.println("5. Thoat");
            String choice = nhap("Chon chuc nang: ");

            switch (choice) {
                case "1": themTaiKhoan(); break;
                case "2": xoaTaiKhoan(); break;
                case "3": xemDanhSach(); break;
                case "4": timKiemTaiKhoan(); break;
                case "5":
                    System.out.println("Thoat chuong trinh.");
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }


    private static String nhap(String message) {
        System.out.print(message);
        return sc.nextLine().trim();
    }

    private static void themTaiKhoan() {
        int idMoi = service.layIdMax() + 1;
        System.out.println("Them tai khoan moi");

        String maTK = nhap("Nhap ma tai khoan: ");
        if (!ValidationService.isNotEmpty(maTK)) {
            System.out.println("Khong duoc de trong ma tai khoan.");
            return;
        }

        String tenChuTK = nhap("Ten chu tai khoan: ");
        if (!ValidationService.isNotEmpty(tenChuTK)) {
            System.out.println("Ten chu tai khoan khong duoc de trong.");
            return;
        }

        String ngayTao = nhap("Nhap ngay tao tai khoan (dd/MM/yyyy): ");
        if (!ValidationService.isNotEmpty(ngayTao)) {
            System.out.println("Ngay tao tai khoan khong duoc de trong.");
            return;
        }

        String loai = nhap("Chon loai tai khoan (1 - Tiet kiem , 2 - Thanh toan): ");

        if (loai.equals("1")) {
            try {
                double soTienGui = Double.parseDouble(nhap("Nhap so tien gui tiet kiem: "));
                if (!ValidationService.isPositiveNumber(soTienGui)) {
                    System.out.println("So tien gui phai la so duong.");
                    return;
                }

                String ngayGui = nhap("Nhap ngay gui tiet kiem (dd/MM/yyyy): ");
                if (!ValidationService.isNotEmpty(ngayGui)) {
                    System.out.println("Ngay gui tiet kiem khong duoc de trong.");
                    return;
                }

                double laiSuat = Double.parseDouble(nhap("Nhap lai xuat (%): "));
                if (!ValidationService.isPositiveNumber(laiSuat)) {
                    System.out.println("Lai xuat phai la so duong.");
                    return;
                }

                int kyHan = Integer.parseInt(nhap("Nhap so thang ky han: "));
                if (kyHan <= 0) {
                    System.out.println("Ky han phai la so duong.");
                    return;
                }

                TaiKhoanTietKiem tk = new TaiKhoanTietKiem(idMoi, maTK, tenChuTK, ngayTao,
                        soTienGui, ngayGui, laiSuat, kyHan);
                service.themTaiKhoan(tk);
                System.out.println("Them tai khoan thanh cong.");
            } catch (NumberFormatException e) {
                System.out.println("Du lieu khong hop le.");
            }
        } else if (loai.equals("2")) {
            try {
                String soThe = nhap("Nhap so the: ");
                if (!ValidationService.isNotEmpty(soThe)) {
                    System.out.println("So the khong duoc de trong.");
                    return;
                }

                double soTien = Double.parseDouble(nhap("Nhap so tien trong tai khoan: "));
                if (!ValidationService.isPositiveNumber(soTien)) {
                    System.out.println("So tien trong tai khoan phai la so duong.");
                    return;
                }

                TaiKhoanThanhToan tk = new TaiKhoanThanhToan(idMoi, maTK, tenChuTK, ngayTao,
                        soThe, soTien);
                service.themTaiKhoan(tk);
                System.out.println("Them tai khoan thanh cong.");
            } catch (NumberFormatException e) {
                System.out.println("Du lieu khong hop le.");
            }
        } else {
            System.out.println("Loai tai khoan khong hop le.");
        }
    }

    private static void xoaTaiKhoan() {
        String maTK = nhap("Nhap tai khoan can xoa: ");
        if (!ValidationService.isNotEmpty(maTK)) {
            System.out.println("Ma tai khoan khong duoc de trong.");
            return;
        }

        boolean ketQua = service.xoaTaiKhoanTheoMa(maTK);
        if (ketQua) {
            System.out.println("Xoa thanh cong. Danh sach hien tai:");
            xemDanhSach();
        } else {
            System.out.println("Tai khoan khong ton tai.");
        }
    }

    private static void xemDanhSach() {
        List<TaiKhoanNganHang> ds = service.getDanhSachTaiKhoan();
        if (ds.isEmpty()) {
            System.out.println("Danh sach trong.");
            return;
        }
        for (TaiKhoanNganHang tk : ds) {
            System.out.println(tk);
        }
    }

    private static void timKiemTaiKhoan() {
        String keyword = nhap("Nhap tu khoa tim kiem (ten chu tai khoan hoac ma tai khoan): ");
        if (!ValidationService.isNotEmpty(keyword)) {
            System.out.println("Tu khoa khong duoc de trong.");
            return;
        }

        List<TaiKhoanNganHang> ketQua = service.timKiem(keyword);
        if (ketQua.isEmpty()) {
            System.out.println("Khong tim duoc tai khoan phu hop.");
        } else {
            System.out.println("Ket qua tim kiem:");
            for (TaiKhoanNganHang tk : ketQua) {
                System.out.println(tk);
            }
        }
    }
}
