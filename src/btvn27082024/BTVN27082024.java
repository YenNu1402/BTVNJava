package btvn27082024;

import java.util.Random;
import java.util.Scanner;

public class BTVN27082024 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String check;
        do{
            System.out.println("Tiep tuc chuong trinh (yes or no) ?");
            check = scanner.next();
            int n = rand.nextInt(100 - 1 + 1) + 1;
            if(n % 2 == 0){
                System.out.println(n + " la so chan");
            } else {
                System.out.println(n + " la so le");
            }
        } while(!check.equals("Yes"));
    }
    
}
