import java.util.Scanner;


public class atividade_2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu número seja negativo ou positivo: ");
        int numero = leitura.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo ");
        } else if (numero < 0) {
            System.out.println("O número é negativo: ");
        } else {
            System.out.println("o número é zero");
        }

    }


}
