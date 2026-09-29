import java.util.Scanner;
public class EXC02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double altura;
        double somaAltura = 0;
        int quantidade = 0;
        String resposta;

        do {
            System.out.print("imforme a altura: ");
            altura = teclado.nextDouble();

            somaAltura += altura;
            quantidade++;

            teclado.nextLine();

            System.out.print("tem mais alturas? (sim/nao): ");
            resposta = teclado.nextLine();

        }while
        (resposta.equalsIgnoreCase("sim"));

            double media = somaAltura / quantidade;

        System.out.printf("A media das alturas é: %.2f", media);

        }
    }

