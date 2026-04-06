/* 
    Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas.
*/

import java.util.Scanner;
public class ex4{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o seu nome pessoa 1: ");
        var nome1 = ler.next();
        System.out.println("Informe sua idade pessoa 1: ");
        var idade1 = ler.nextInt();
        System.out.println("Informe o seu nome pessoa 2: ");
        var nome2 = ler.next();
        System.out.println("Informe sua idade pessoa 2: ");
        var idade2 = ler.nextInt();
        var idadeDiferenca = idade1 - idade2;
        System.out.printf("A diferença de idade entre %s e %s é de %d anos", nome1, nome2, idadeDiferenca);
    }
}