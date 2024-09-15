package btvn2408;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = scanner.hasNext();
        System.out.println("Co token khong? " + check);
    }
}
