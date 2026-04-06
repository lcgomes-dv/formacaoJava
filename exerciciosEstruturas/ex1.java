/*
    Escreva um código onde o usuário entra com um número e seja
    gerada a tabuada de 1 até 10 desse número
*/
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um número e descubra sua tabuada: ");
        var number = scanner.nextInt();
        for (int i = 1; i <= 10; i++){
            var result = number * i;
            System.out.printf("%d X %d = %d", number, i, result);
            System.out.println();
        }
    }
}
