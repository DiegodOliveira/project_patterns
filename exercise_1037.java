import java.io.IOException;
import java.util.Scanner;
public class exercise_1037 {
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);

        float number;

        number = leitor.nextFloat();

        if(number > 0 && number <= 25 ){
            System.out.println("Intervalo [0,25]");
        }else if(number >= 25 && number <= 50){
            System.out.println("Intervalo (25,50]");
        }else if(number >= 75 && number <= 100){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}
