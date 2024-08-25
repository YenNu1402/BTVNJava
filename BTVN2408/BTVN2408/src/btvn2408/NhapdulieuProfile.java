package btvn2408;

import java.util.Scanner;

public class NhapdulieuProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap du lieu: ");
        System.out.println("Nhap ho va ten: ");
        String ten = scanner.nextLine();
        System.out.println("Nhap nam sinh: ");
        int namsinh = scanner.nextInt();
        System.out.println("Nhap tuoi: ");
        int tuoi = scanner.nextInt();
        System.out.println("Nhap gioi tinh: ");
        String gioitinh = scanner.next();
        System.out.println("Nhap GPA: ");
        float gpa = scanner.nextFloat();
        System.out.println("Nhap que quan: ");
        scanner.nextLine();
        String quequan = scanner.nextLine();
        System.out.println(ten + "-" + namsinh + "-" + tuoi + "-" + gioitinh + "-" + gpa + "-" + quequan);
    }
}
