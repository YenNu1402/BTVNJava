package btvn2208;

import java.util.Scanner;

public class BTVN2208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap tu ban phim 2 so nguyen: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tong hai so nguyen: " + (x+y));
        System.out.println("Hieu hai so nguyen: " + (x-y));
        System.out.println("Tich hai so nguyen: " + (x*y));
        if (y!=0){
        System.out.println("Thuong hai so nguyen: " + (x/y));
        System.out.println("Chia lay du 2 so nguyen: " + (x%y));
        } else {
            System.out.println("Khong the chia cho 0");
        }
}
}
