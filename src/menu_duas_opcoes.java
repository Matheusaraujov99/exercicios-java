import java.util.Scanner;

public class menu_duas_opcoes {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int opcaoSelecionada = -1;

        while (opcaoSelecionada != 0) {
            System.out.println("Quais das opções você escolhe: ");
            System.out.println("1 - para calcular a área do quadrado");
            System.out.println("2 - para calcular a área do círculo");
            System.out.println("0 - sair do programa");

            opcaoSelecionada = leitura.nextInt();

            if (opcaoSelecionada == 1) {
                System.out.println("Digite o valor de dois lados: ");
                int primeiroValorQuadrado = leitura.nextInt();
                int segundoValorQuadrado = leitura.nextInt();
                int areaQuadrado = primeiroValorQuadrado * segundoValorQuadrado;
                System.out.println("A área do quadrado é: " + areaQuadrado);

            } else if (opcaoSelecionada == 2) {
                System.out.println("Digite o valor do raio: ");
                double valorRaio = leitura.nextDouble();
                double areaCirculo = Math.PI * valorRaio * valorRaio;
                System.out.println("O valor da área do círculo é: " + areaCirculo);

            } else if (opcaoSelecionada == 0) {
                System.out.println("Você optou por sair do programa!");

            } else {
                System.out.println("O valor digitado não corresponde com as opções fornecidas!");
            }
        }

        leitura.close();
    }
}