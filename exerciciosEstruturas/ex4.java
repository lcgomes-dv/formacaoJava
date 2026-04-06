/*
    Escreva um código onde o usuário informa um número inicial,
    posteriormente irá informar outros N números, a execução do 
    código irá continuar até que o número informado dividido pelo
    primeiro número tenha resto diferente de 0 na divisão, números
    menores que o primeiro número devem ser ignorados.
*/

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        var numIni = scanner.nextInt();
        var verification = true;
        while (verification) {
            System.out.println("Informe um número para verificação: ");
            var verify = scanner.nextInt();
            if(verify < numIni){
                System.out.printf("Informe um número maior que %d: ", numIni);
                continue;
            } 
            
            var result = verify % numIni;
            verification = result == 0;
            System.out.printf("%d %% %d = %d \n", verify, numIni, result);
        }
    }
}
