package com.codegym;

public class Main {
    public static void main(String[] args) {
//        int arr[] = {1, -3, 43, 52, 3};
//        int K = 1;
//        findElement(arr, K);
        int arr[] = {1, 3, 5, 7, 8, 10, 21, 4};
        int K = 5;
        binarySearch(arr, K);
    }

    public static void findElement(int[] arr, int K) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == K) {
                System.out.println("Vị trị phần tử K là: " + i);
                return;
            }
        }
        System.out.println("Không tim thấy phần tử K trong mảng");
    }

    public static void binarySearch(int[] arr, int K) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2; // 3.5 => 3
            if (arr[mid] == K) {
                System.out.println("Tìm thấy K ở vị trí: " + mid);
                return;
            } else if (K > arr[mid]) {
                left = mid + 1;
            } else if (K < arr[mid]) {
                right = mid - 1;
            }
        }
        System.out.println("Không tìm thấy K");
    }
}