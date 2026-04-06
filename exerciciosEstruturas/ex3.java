/*
    Escreva um código que o usuário entre com um primeiro número,
    um segundo número maior que o primeiro e escolha entre a opção
    par ou ímpar, com isso o código deve informar todos os números pares
    ou impares (de acordo com a seleção inicial) no intervalo de números
    informados, incluindo os números informados e em ordem decrescente;
*/
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.print("Informe dois números quaisquer inteiros positivos(O segundo número deve ser maior que o primeiro): ");
        var number1 = scanner.nextInt();
        var number2 = scanner.nextInt();
        System.out.print("Agora escolha entre ímpar ou par: ");
        var evenOdd = scanner.next();
        if (evenOdd.equalsIgnoreCase("impar")) {
            for(int i = number2; i >= number1; i--){
                 if (i % 2 == 1) {
                    System.out.printf("Os números impares em ordem decrescente de %d até o número %d são: %d", number2, number1, i);
                    System.out.println();
                }
            }
                
        } else if (evenOdd.equalsIgnoreCase("par")){
            for(int i = number2; i >= number1; i--){
                if (i % 2 == 0) {
                System.out.printf("Os números pares em ordem decrescente de %d até o número %d são: %d", number2, number1, i);
                System.out.println();
                }
            }
        } else{
            System.out.print("Por favor, informe impar ou par");
        }
    }
}
