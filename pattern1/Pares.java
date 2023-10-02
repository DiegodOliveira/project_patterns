package pattern1;
import java.util.Scanner;

public class Pares {
    int numeros;
    int count = 0;

    Scanner leitor = new Scanner(System.in);

    public void evens(){
        for(int i = 0; i < 5; i++){
            numeros = leitor.nextInt();
            if(numeros % 2 == 0){
                count++;
            }
        }
    }

    public int getCount(){
        return count;
    }
}
