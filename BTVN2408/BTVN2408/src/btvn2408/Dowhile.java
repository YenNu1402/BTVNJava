package btvn2408;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase;
        do{
            System.out.println("Type your password: ");
            phrase = scanner.next();
        } while (!phrase.equals("duytan"));
    }
}
