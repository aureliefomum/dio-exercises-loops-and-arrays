package br.com.dio.exercises.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        //NB:existem 5 posições aqui dentro
        int[] vetor = {-5,-6,15,50,8,4};
        //System.out.println(vetor.length);
        System.out.println("Vetor: ");
        int count = 0;

      while(count < (vetor.length)){
          System.out.print(vetor[count] + " ");
          count++;
      }
        System.out.println("\nVetorInverso: ");
      for(int i = (vetor.length-1);i>=0; i--){
            System.out.print(vetor[i] + " ");
      }



    }

}
