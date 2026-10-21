import java.util.Scanner;
public class exc4mes10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] cores = {
                "vermelho",
                "alaranjado",
                "amarelo",
                "verde",
                "azul",
                "anil",
                "violeta"
        };

        System.out.println("digite uma cor: ");

        String resposta = teclado.nextLine();

        System.out.println("voce digitou: [" + resposta + "]");

        for (int i = 0; i < cores.length; i++) {

            if (resposta.trim().equalsIgnoreCase(cores[i])) {

                System.out.println("acertou!");
                teclado.close();
                return;
            }
        }
        System.out.println("errou!");

    }
}
