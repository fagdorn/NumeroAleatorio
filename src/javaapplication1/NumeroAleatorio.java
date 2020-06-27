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

        int numAleatorio = new Random().nextInt(10);
        
        int tentativas = 1;
        int numAposta;
        do{
            System.out.print(tentativas +"º"+" tentativa: ");
            numAposta = tec.nextInt();
            tentativas++;
            if (numAposta == numAleatorio){
                System.out.println("Parabéns, você acertou!"+ numAleatorio);
                break;
            } else {
                if (numAposta > numAleatorio)
                    System.out.println("O número é menor que o informado...");
                else
                    System.out.println("O número é maior que o informado...");
            }
        }while (tentativas <= 3);
       
        if (numAposta != numAleatorio)
            System.out.println("Você fracassou! O número era: "+numAleatorio);

    }
    
}
