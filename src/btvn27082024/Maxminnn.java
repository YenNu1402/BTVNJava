package btvn27082024;

import java.util.Scanner;

public class Maxminnn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        int [] a = new int[n];
        System.out.println("Nhap cac phan tu: ");
        for(int i=0; i<n; i++)
        {
            a[i] = scanner.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for(int i=0; i<n; i++)
        {
            if(a[i] > max){
                max = a[i];
            }
        }
        for(int i=0; i<n; i++)
        {
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Gia tri lon nhat la " + max);
        System.out.println("Gia tri nho nhat la " + min);
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum += a[i];
        }
        System.out.println("Tong gia tri cac phan tu la " + sum);
        double avg = (double) sum / n;
        System.out.println("Trung binh gia tri la " + avg);
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++)
            {
                if(a[i] > a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("Mang sau khi sap xep tang dan la: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
