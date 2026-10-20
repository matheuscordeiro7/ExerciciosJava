import java.util.Scanner;
public class exc2mes10 {
    public static void main(String[] args)
    {
        Scanner teclado = new
      Scanner(System.in);

        String[] empresas = {
                "Dr.Silva, Dentista",
                "Contabilidade silva",
                "Dr.silva, Cardiologista",
                "Silvana Silva, manicure",
                "Silva & Silva Advogados Associados"
        };

        System.out.print("digite o numero do escritorio (101 a 105): ");
                int numero = teclado.nextInt();

                if (numero >= 101 && numero <= 105) {
                    System.out.println("Empresa: " + empresas[numero - 101]);
                } else {
                    System.out.println("esse numero de escritorio nao existe.");
                }
    }
}
