import java.io.IOException;
import java.util.Scanner;
public class exercise_1035 {
    public static void main(String[] args) throws IOException {
        int A,B,C,D;

        Scanner leitor = new Scanner(System.in);

        A = leitor.nextInt();
        B = leitor.nextInt();
        C = leitor.nextInt();
        D = leitor.nextInt();

        int sum1 = C + D;
        int sum2 = A + B;

        if(B > C && D > A && sum1 > sum2 && C > 0 && D > 0 && A  % 2 == 0){
            System.out.println("Valores Aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}
