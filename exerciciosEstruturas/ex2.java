/*
    Escreva um código onde o usuário entra com sua altura e peso,
    seja feito o cálculo do seu IMC (IMC = peso/(altura*altura))
    e seja exibida a mensagem de acordo com o resultado:

    - Se for menor ou igual a 18,5 "Abaixo do peso"
    - se for entre 18,6 e 24,9 "Peso ideal"
    - se for entre 25,0 e 29,9 "Levemente acima do peso"
    - se for entre 30,0 e 34,9 "Obesidade Grau 1"
    - se for entre 35,0 e 39,0 "Obesidade Grau 2 (Severa)"
    - se for maior que 40,0 "Obesidade Grau 3 (Mórbida)"
*/

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.print("Informe sua altura e peso, por favor: ");
        var height = scanner.nextDouble();
        var weight = scanner.nextDouble();
        var resultImc = weight/(height*height);

        if (resultImc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if(18.6 <= resultImc && resultImc <= 24.9){
            System.out.println("Peso ideal");
        } else if(25 <= resultImc && resultImc <= 29.9){
            System.out.println("Levemente acima do peso");
        } else if(30 <= resultImc && resultImc <= 34.9){
            System.out.println("Obesidade Grau 1");
        } else if(35 <= resultImc && resultImc <= 39.9){
            System.out.println("Obesidade Grau 2 (Severa)");
        } else if(resultImc >= 40){
            System.out.println("Obesidade Grau 3(Mórbida)");
        } else{
            System.out.println("Por favor, digite um valor válido!");
        }
    }
}
