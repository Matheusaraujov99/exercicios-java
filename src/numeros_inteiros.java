import java.util.Scanner;


public class numeros_inteiros {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");

        int primeiroNumero = leitura.nextInt();
        int segundoNumero = leitura.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("Os números são iguais!");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println("O primeiro número " + primeiroNumero + " é maior que o segundo número " + segundoNumero);
        } else {
            System.out.println("O segundo número é maior " + segundoNumero + " que o primeiro " + primeiroNumero);
        }

    }
}
