package br.com.dio.exercises.loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fatorial: ");
        int fatorial= scan.nextInt();
        int multiplicação = 1;

        for(int i=fatorial; i>1;i-- ){

            multiplicação = multiplicação * i;
        }
        System.out.println(fatorial + "!" + "= "  + multiplicação);


    }
}
