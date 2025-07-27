//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random geradorNumero = new Random();

        int numeroSecreto = geradorNumero.nextInt(101);

        Scanner adivinhe = new Scanner(System.in);

        int tentativas = 0;
        boolean respostaCorreta = false;

        while (tentativas < 5) {
            System.out.println("Tente adivinhar qual o número sorteado: ");
            int tentativa = adivinhe.nextInt();
            tentativas++;

            if (tentativa == numeroSecreto) {
                System.out.println("Você acertou em cheio! O número sorteador é: " + numeroSecreto);
                respostaCorreta = true;
                break;
            } else if (tentativa < numeroSecreto) {
                System.out.println("O número sorteado é maior! Tente outra vez: " + tentativa);
            } else {
                System.out.println("O número sorteador é menor! Tente outra vez: " + tentativa);
            }

        }

        if (respostaCorreta == false) {
            System.out.println("Suas chances esgotaram! :( ");
        }
    }

}