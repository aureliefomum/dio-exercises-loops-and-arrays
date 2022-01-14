package br.com.dio.exercises.loops;

import java.util.Scanner;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        int maior = 0;
       //cria uma variavel para ser  contador
        int count = 0;
        int soma = 0;



        do {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();

            soma = soma + numero;


            if (numero > maior) maior = numero;
            count = count + 1;

        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma/5);


    }

}
