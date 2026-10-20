import java.util.Scanner;
public class exc3mes10 {
    public static void main(String[] args)
    {
       Scanner teclado = new
      Scanner(System.in);

       System.out.print("Quantas notas deseja digitar?: ");
          int quantidade = teclado.nextInt();

          double[] notas = new double[quantidade];
          double soma = 0;

          for (int i = 0; i < notas.length; i++){

              System.out.print("digite a nota" + (i + 1) + ": ");
              notas[i] = teclado.nextDouble();
              soma = soma + notas[i];
          }

          System.out.println("\nNotas digitadas: ");

              for (int i = 0; i < notas.length; i++) {

                  System.out.println(notas[i]);

                  double media = soma / quantidade;
                  System.out.println("media das notas: " + media);

    }
    }
}
