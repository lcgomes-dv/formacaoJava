/*
    Escreva um código que receba o tamanho do lado de um quadrado,
    calcule sua área e exiba na tela.
*/

import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor do lado do quadrado:");
        var lado = ler.nextDouble();
        var area = lado * lado;
        System.out.printf("A área do quadrado é: %.2f", area);
        ler.close();
    }
}