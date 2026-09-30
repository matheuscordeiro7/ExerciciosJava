import java.util.Scanner;
public class EXC02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double altura = 0;
        double somaAltura = 0;
        int quantidade = 0;
        String resposta;
        double somaAltos = 0;
        int quantidadeAltos = 0;

        do {


            System.out.print("informe a altura: ");
            altura = teclado.nextDouble();

            if (altura >= 1.80) {
                somaAltos += altura;
                quantidadeAltos++;

                if (quantidadeAltos > 0) {
                    double mediaAltos = somaAltos / quantidadeAltos;

                    System.out.printf("a media de altura das pessoas altas é: %.2f", mediaAltos);
                } else {
                    System.out.println("nenhuma pessoa alta foi informada.");
                }
                somaAltura += altura;
                quantidade++;

                System.out.print("tem mais alturas? (sim/nao): ");
                resposta = teclado.next();

            }
            while
            (resposta.equalsIgnoreCase("sim")) ;

            double media = somaAltura / quantidade;

            System.out.printf("A media da altura das %d pessoas é: %.2f", quantidade, media);

        }
    }
}
