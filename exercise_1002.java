import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class exercise_1002 {
    public static void main(String[] args) throws IOException{
        double pi = Math.PI;
        double R;

        Scanner leitor = new Scanner(System.in);
        R = leitor.nextDouble();

        double A = pi * (R*R);

        System.out.printf("A = %.4f", A);
    }
}
