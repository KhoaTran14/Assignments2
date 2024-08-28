package assignments3;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }
        System.out.println("Cac phan tu trong mang la: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + (i + 1) + " : " + a[i]);
        }
        //Tìm Max, Min
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i]; //
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        // Tính Tổng
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("Tong cac phan tu trong mang la: " + sum);
        //Tính Trung Bình Cộng
        double avg = (double) sum / n ;
        System.out.println("Trung binh cong cua cac phan tu trong mang la: " + avg);
        // Sắp xếp mảng tăng dần
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                if (a[j] > a[i]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.print("Mang sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
