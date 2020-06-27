/* Implemente um programa que sorteia um número de 1 a 10 e dá ao usuário 3 tentativas de acertá-lo. 
A cada tentativa errada, o programa informa se o número a adivinhar está abaixo ou acima 
*/

package javaapplication1;

/**@jonathan.miritz*/

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {

    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        System.out.println("Tente acertar o número aleatório!");
        Random random = new Random ();
        int numero = random.nextInt(10);
        
        int tentativas = 1;
        int Aposta;
        do{
            System.out.print(tentativas +"º"+" tentativa: ");
            Aposta = tec.nextInt();
            tentativas++;
            if (Aposta == numero){
                System.out.println("Parabéns, você acertou!"+ numero);
                break;
            } else {
                if (Aposta > numero)
                    System.out.println("O número é menor que o informado...");
                else
                    System.out.println("O número é maior que o informado...");
            }
        }while (tentativas <= 3);
       
        if (Aposta != numero)
            System.out.println("Você fracassou! O número era: "+numero);

    }
    
}
