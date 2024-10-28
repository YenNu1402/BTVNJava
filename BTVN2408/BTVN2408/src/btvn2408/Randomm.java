package btvn2408;

import java.util.Random;

public class Randomm {
    public static void main(String[] args) {
        Random rand = new Random();
        int r = rand.nextInt(9) + 12;
        System.out.println("x= " + r);
    }
}
