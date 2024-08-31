package btvn2408;

import java.util.Scanner;

public class Ptbac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap b: ");
        int b = scanner.nextInt();
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh co vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else {
            double x = (double) -b/a;
            System.out.println("Phuong trinh co nghiem x= " + x);
            }
    }
}
