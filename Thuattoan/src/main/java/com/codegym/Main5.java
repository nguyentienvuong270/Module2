package com.codegym;

public class Main5 {
    public static void main(String[] args) {
        /*
        Nhập a,b,c. In ra số lượng các số 3 chữ số có thể tạo ra từ a,b,c (không trùng, khác 0)
        Input: a b c
        Output: số lượng 3 chữ số tạo ra từ a,b,c (Không trùng, khác 0)

        Input: 1,2,3;
        Output:
        123, 321, 111, 222, 333, 132,...
        */
        int a = 4;
        int b = 5;
        int c = 0;
        int[] arr = {a, b, c};
        int count = 0;
        for (int i = 0; i < 3; i++) { // i đại diện số thứ nhất
            for (int j = 0; j < 3; j++) { // j đại diễn số thứ 2
                for (int k = 0; k < 3; k++) { // k đại diện số thứ 3
                    if (i != j && j != k && k != i && arr[i] != 0) {
                        System.out.println("abc: " + arr[i] + "" + arr[j] + "" + arr[k]); // 0 1 2 => 164
                        count++;
                    }
                }
            }
        }
        System.out.println("Output = " + count);
    }

    // Input: [1,1,2,3,4,5,2,4] => x = 1 => 2 lần
    // Nâng cấp
    // 1 - 2 lần
    // 2 - 1 lần
    // 3 - 1 lần
    // 4 - 2 lần
    // Gợi ý dùng map
}
