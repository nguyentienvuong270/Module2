package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static Scanner sc = new Scanner(System.in);
    private static List<SanPham> dsSanPham = new ArrayList<>();
    private static List<XuatHang> lichSuXuat = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n ----------  MENU QUAN LY SAN PHAM ----------");
            System.out.println("1. Them san pham");
            System.out.println("2. Danh sach san pham");
            System.out.println("3. Tim kiem theo ten");
            System.out.println("4. Sua thong tin san pham");
            System.out.println("5. Xoa san pham");
            System.out.println("6. Nhap them san pham");
            System.out.println("7. Xuat san pham");
            System.out.println("8. Hien thi doan thu");
            System.out.println("9. Thoat");
            System.out.print("Chon yeu cau cua ban: ");

            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1: themSanPham(); break;
                case 2: hienThiSanPham(); break;
                case 3: timKiemSanPham(); break;
                case 4: suaSanPham(); break;
                case 5: xoaSanPham(); break;
                case 6: nhapKho(); break;
                case 7: xuatKho(); break;
                case 8: hienThiDoanhThu(); break;
                case 9:
                    System.out.println("Da thoat chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }
    }

    public static void themSanPham() {
        System.out.print("Ten san pham: ");
        String ten = sc.nextLine();

        System.out.print("Loai: ");
        String loai = sc.nextLine();

        double gia = -1;
        while (true) {
            try {
                System.out.print("Gia san pham: ");
                gia = Double.parseDouble(sc.nextLine());
                if (gia < 0) {
                    System.out.println("Gia khong duoc am.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhap gia thanh cong.");
            }
        }

        int sl = -1;
        while (true) {
            try {
                System.out.print("So luong: ");
                sl = Integer.parseInt(sc.nextLine());
                if (sl < 0) {
                    System.out.println("So luong khong duoc am.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhap so luong hop le.");
            }
        }

        SanPham sp = new SanPham(ten, loai, gia, sl);
        dsSanPham.add(sp);
        System.out.println("Da them san pham.");
    }

    public static void hienThiSanPham() {
        if (dsSanPham.size() == 0) {
            System.out.println("Khong co san pham nao");
        } else {
            System.out.println("\n----- Danh sach san pham -----");
            for (SanPham sp : dsSanPham) {
                System.out.println(sp);
            }
        }
    }

    public static void nhapKho() {
        System.out.print("Nhap ma san pham: ");
        int ma = sc.nextInt();
        sc.nextLine();
        for (SanPham sp : dsSanPham) {
            if (sp.getMaSP() == ma) {
                System.out.print("Nhap so luong can them: ");
                int sl = sc.nextInt();
                sc.nextLine();
                sp.setSoLuong(sp.getSoLuong() + sl);
                System.out.println("Da nhap them");
                return;
            }
        }
        System.out.println("Khong co san pham nay:");
    }

    public static void xuatKho() {
        System.out.print("Nhap ma san pham:");
        int ma = sc.nextInt();
        sc.nextLine();
        for (SanPham sp : dsSanPham) {
            if (sp.getMaSP() == ma) {
                System.out.print("Nhap so luong san pham can ban:");
                int sl = sc.nextInt();
                sc.nextLine();
                if (sl <= sp.getSoLuong()) {
                    sp.setSoLuong(sp.getSoLuong() - sl);
                    lichSuXuat.add(new XuatHang(sp.getTenSP(), sl, sp.getGiaSP()));
                    System.out.println("Da ban");
                } else {
                    System.out.println("So luong hang khong du");
                }
                return;
            }
        }
        System.out.println("Khong tim thay san pham");
    }

    public static void timKiemSanPham() {
        System.out.print("Nhap ten san pham can tim: ");
        String ten = sc.nextLine().toLowerCase();
        boolean timThay = false;

        for (SanPham sp : dsSanPham) {
            if (sp.getTenSP().toLowerCase().contains(ten)) {
                System.out.println(sp);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("\n Khong tim thay san pham phu hop");
        }
    }

    public static void suaSanPham() {
        System.out.print("Nhap ma san pham can sua: ");
        int ma = sc.nextInt();
        sc.nextLine();

        for (SanPham sp : dsSanPham) {
            if (sp.getMaSP() == ma) {
                System.out.print("Ten moi ( bo trong neu khong sua ): ");
                String tenMoi = sc.nextLine();
                if (!tenMoi.isEmpty()) {
                    sp.setTenSP(tenMoi);
                }

                System.out.print("Loai moi ( bo trong neu khong sua ): ");
                String loaiMoi = sc.nextLine();
                if (!loaiMoi.isEmpty()) {
                    sp.setLoaiSP(loaiMoi);
                }

                System.out.print("Gia moi ( -1 de giu nguyen): ");
                double giaMoi = sc.nextDouble();
                sc.nextLine();
                if (giaMoi >= 0) {
                    sp.setGiaSP(giaMoi);
                }

                System.out.println("Da cap nhat");
                return;
            }
        }

        System.out.println("Khong tim thay san pham");
    }

    public static void xoaSanPham() {
        System.out.print("Nhap ma san pham can xoa: ");
        int ma = sc.nextInt();
        sc.nextLine();

        Iterator<SanPham> iterator = dsSanPham.iterator();
        while (iterator.hasNext()) {
            SanPham sp = iterator.next();
            if (sp.getMaSP() == ma) {
                iterator.remove();
                System.out.println("Da xoa san pham");
                return;
            }
        }

        System.out.println("Khong tim thay san pham");
    }

    public static void hienThiDoanhThu() {
        if (lichSuXuat.isEmpty()) {
            System.out.println("Chua co giao dich nao");
            return;
        }

        System.out.println("\n--- Lich su ban ---");
        double tong = 0;
        for (XuatHang xh : lichSuXuat) {
            System.out.println(xh);
            tong += xh.getThanhTien();
        }
        System.out.printf(">>> Tong doanh thu: \n" + tong + "$");
    }
}