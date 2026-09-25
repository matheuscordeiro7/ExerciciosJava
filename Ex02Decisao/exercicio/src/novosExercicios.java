import java.util.Scanner;
public class novosExercicios {
    public static void main(String[] args) {
        // pede pra digitar uma palavra varias vezes
        // so para quando a pessoa responder "banana"
        Scanner scanner = new Scanner(System.in);
        String texto;
        int voltas = 0;
        do{
            System.out.println(" digite qualquer palavra");
            texto = scanner.next();
            voltas++; // soma mais 1 em voltas

            System.out.println("palavra numero " + voltas + ": " + texto);
        }while(!texto.equals("banana") && voltas < 3);

        if (texto.equals("banana")) {
            System.out.println("parabens voce acertou!");
        } else {
            System.out.println("voce errou 3 vezes!");
            System.out.println("a palavra era banana: ");
        }
        System.out.printf("voce tentou %d vezes\n" ,voltas);
    }
}
