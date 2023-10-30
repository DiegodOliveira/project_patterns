import java.io.IOException;
import java.util.Scanner;

public class exercise_1001 {
    public static void main(String[] args) throws IOException{
        int A,B;

        Scanner leitor = new Scanner(System.in);
        A = leitor.nextInt();
        B = leitor.nextInt();

        int soma = A + B;

        System.out.println("X = " + soma);
    }
}
