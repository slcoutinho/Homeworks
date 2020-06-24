package Aula02;

import java.util.Scanner;

public class Exercicio17{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salario, imposto;
        System.out.println("Digite o salario: ");
        salario = teclado.nextFloat();

        if (salario < 1000.0f){
            imposto = 0;
        }
        else{   // ja sei que o salario é >= 1000
            if (salario < 2500){
                imposto = salario * 12.5f/100;
            }
            else{   // ja sei que é >=1000 e também >=2500
                if (salario < 5000){
                    imposto = salario * 25f/100;
                }
                else{ // já sei que é maior que 5000
                    imposto = 1300;
                }
            }
        }
        System.out.println("Seu imposto devido R$ "+imposto);
        teclado.close();
    }
}