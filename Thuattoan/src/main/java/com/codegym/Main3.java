package com.codegym;

public class Main3 {
    public static void main(String[] args) {
        int N = 2;
        int S = 2;
        int count = 0;
        for (int X = 0; X <= N; X++) {  // 0 <= X <= N => X = 2 với Tìm các Y tương ứng (Y=0, Y=1, Y=2)
            for (int Y = 0; Y <= N; Y++) { // 0 <= Y <= N
                int Z = S - X - Y; // >= 0
                if (Z >= 0 && Z <= N) {
                    System.out.println("(X, Y, Z): " + X + "," + Y + "," + Z);
                    count++;
                }
            }
        }
        System.out.println("Số bộ (X, Y, Z) là : " + count);
    }

    /*
    N S
    2 2
    =>
    (0, 0, 2)
    (2, 0, 0)
    (0, 2, 0)
    (1, 1, 0)
    (1, 0, 1)
    (0, 1, 1)
    => Output = 6

    X, Y, Z thuộc [0, N], X + Y + Z = S
    => Output số bộ (X, Y, Z)

     */
    // Vét cạn
}
