import java.util.Scanner;
import javax.print.attribute.standard.Media;
public class exercise_1006 {
    public static void main(String[] args) {
        double A,B,C, media;

        Scanner leitor = new Scanner(System.in);
        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();

        media = ((A * 2) + (B * 3) + (C * 5))/10;

        System.out.println(String.format("MEDIA = %.1f", media));
    }
}
