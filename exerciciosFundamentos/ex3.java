/*
    Escreva um código que receba a base e a altura de um retângulo,
    calcule sua área e exiba na tela.
*/

import java.util.Scanner;

public class ex3{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor da base do retângulo(cm): ");
        var base = ler.nextInt();
        System.out.println("Informe o valor da altura do retângulo(cm): ");
        var altura = ler.nextInt();
        var area = base * altura;
        System.out.printf("O Retângulo informado tem valor de Área igual a %d", area);
        ler.close();
    }
}