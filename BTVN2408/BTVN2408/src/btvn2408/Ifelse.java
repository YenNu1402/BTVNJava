package btvn2408;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = scanner.nextInt();
        if (x > 0){
            System.out.println("x la so duong");
        } else if (x < 0){
            System.out.println("x la so am");
        } else {
            System.out.println("x bang 0");
        }
    }
}
