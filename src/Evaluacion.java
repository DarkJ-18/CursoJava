import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluacion = 0;
        double totalEvaluacion = 0;

         while (nota != -1) {
             System.out.println("escribe la nota que le darias a la pelicula");
             nota = teclado.nextDouble();
             if (nota != -1) {
                 mediaEvaluacion += nota;
                 totalEvaluacion++;
             }
         }
         System.out.println("La media de evalacion es: " + mediaEvaluacion / totalEvaluacion);
         }
}
