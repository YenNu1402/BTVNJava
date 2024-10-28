package btvn0209;

import java.util.ArrayList;
import java.util.Scanner;

class NumberExercise {
    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap so luong phan tu:: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }
        return numbers;
    }
    public static void DisplayData(ArrayList<Integer> numbers) {
        System.out.println("Mang so nguyen:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int findMax2(ArrayList<Integer> numbers) {
        if (numbers.size() < 2) {
            System.out.println("Mang khong du phan tu de tim gia tri lon thu 2 !!!");
            return -1;
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            System.out.println("Khong co gia tri lon thu 2 trong mang!!!");
            return -1;
        }

        return max2;
    }
    public static void deleteOddNumber(ArrayList<Integer> numbers) {
        numbers.removeIf(num -> num % 2 != 0);
        System.out.println("Đa xoa cac phan tu so le.");
    }
}
class Process {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Nhap mang so nguyen.");
            System.out.println("2. Xuat mang so nguyen.");
            System.out.println("3. Tim gia tri lon thu 2 trong mang.");
            System.out.println("4. Xoa cac phan tu le.");
            System.out.println("5. Thoat.");
            System.out.print("Lua chon cua ban: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    numbers = NumberExercise.EnterData(numbers);
                    break;
                case 2:
                    NumberExercise.DisplayData(numbers);
                    break;
                case 3:
                    int max2 = NumberExercise.findMax2(numbers);
                    if (max2 != -1) {
                        System.out.println("Gia tri lon thu 2 trong mang la: " + max2);
                    }
                    break;
                case 4:
                    NumberExercise.deleteOddNumber(numbers);
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le..");
                    break;
            }
        } while (choice != 5);
    }
}