import java.util.Scanner;

public class exercise_1005 {
    public static void main(String[] args) {

        double A = 3.5;
        double B = 7.5;

        Scanner leitor = new Scanner(System.in);
        double nota1 = leitor.nextDouble();
        double nota2 = leitor.nextDouble();


        double media = ((A * nota1) + (B * nota2))/11;

        System.out.printf("MEDIA = %.5f", media);

    }
}
