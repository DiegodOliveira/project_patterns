import java.util.Scanner;
import java.io.IOException;

public class exercise_1065 {
    public static void main(String[] args) throws IOException{
        int numeros;
        int count = 0;

        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            numeros = leitor.nextInt();
            if(numeros % 2 == 0){
                count++;
            }
        }

        System.out.println(count + " valores pares");
    }
}
