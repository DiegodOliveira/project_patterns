import java.io.IOException;
import java.util.Scanner;

public class exercise_1007 {
    public static void main(String[] args) throws IOException{
        int A,B,C,D;

        Scanner leitor = new Scanner(System.in);
        A = leitor.nextInt();
        B = leitor.nextInt();
        C = leitor.nextInt();
        D = leitor.nextInt();

        int diference = A * B - C * D;

        System.out.println("DIFERENCA = " + diference);

    }
}
