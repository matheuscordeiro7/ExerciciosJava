import java.util.Scanner;
public class novosExercicios {
    public static void main(String[] args) {
        // pede pra digitar uma palavra varias vezes
        // so para quando a pessoa responder "banana"
        Scanner scanner = new Scanner(System.in);
        String texto;
        do{
            System.out.println("digite qualquer palavra");
            texto = scanner.next();
        }while(!texto.equals("banana"));
    }
}
