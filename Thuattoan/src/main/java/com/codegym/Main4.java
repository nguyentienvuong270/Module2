package com.codegym;

public class Main4 {
    public static void main(String[] args) {
        int man = 7; // 4 cháu nam => 2 cặp đồng giới
        int woman = 3; // 3 nữ
        int soCapKhacGioi = Math.min(man, woman);
        int soNguoiChuaGhep = Math.abs(man - woman);
        int soCapDongGioi = soNguoiChuaGhep / 2;
        System.out.println("Số cặp khác giới: " + soCapKhacGioi);
        System.out.println("Số cặp đồng giới: " + soCapDongGioi);


        // ======
//        int nam = 2;
//        int nu = 3;
//        int capNamNu;
//        int capDG;
//        if (nam < nu) {
//            capNamNu = nam;
//            capDG = (nu - nam) / 2;
//        } else {
//            capNamNu = nu;
//            capDG = (nam - nu) / 2;
//        }
    }

    /*
    Input: Nam    Nữ
            3     1
    Output: Số cặp khác giới, Số cặp đồng giới
             1                  1
     */
}
