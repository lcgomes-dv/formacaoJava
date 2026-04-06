/*
    Escreva um código que receba o nome e o ano de nascimento
    de alguem e imprima na tela a seguinte mensagem:
    "Olá "fulano" você tem "X" anos"
*/

import java.time.OffsetDateTime;
import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o seu primeiro nome:");
        var nome = ler.next();
        System.out.println("Informe o seu ano de nascimento:");
        var anoNascimento = ler.nextInt();
        var anoAtual = OffsetDateTime.now().getYear();
        var idade = anoAtual - anoNascimento;
        System.out.printf("Olá %s, você tem %d anos", nome, idade);
        ler.close();
    }
}