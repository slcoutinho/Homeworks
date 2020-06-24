package Aula02;

import java.util.Scanner;

public class Exercicio20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int sexo;
        float altura;
        float pesoIdeal;

        sexo = teclado.nextInt(); // para simplificar 0 = masc / 1 = fem
        altura = teclado.nextFloat();

        if (sexo == 0){
            pesoIdeal = (72.7f * altura) - 58.0f;
        }
        else{
            pesoIdeal = (62.1f * altura) - 44.7f;
        }
        System.out.println("Seu peso ideal vale = "+pesoIdeal);   
        teclado.close();
    }
}