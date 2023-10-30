import java.util.Scanner;
import java.io.IOException;
public class exercise_1066 {
    public static void main(String[] args)  throws IOException{
        int numero;
        int contNeg = 0;
        int contPos = 0;
        int contEven = 0;
        int contOdd = 0;
        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            numero = leitor.nextInt();
            if(numero < 0) contNeg++;
            if(numero > 0) contPos++;
            if(numero % 2 == 0) contEven++;
            if(numero % 2 != 0) contOdd++;

        }

        System.out.println(contEven + " valor(es) par(es)");
        System.out.println(contOdd + " valor(es) ímpar(es)");
        System.out.println(contPos + " valor(es) positivo(s)");
        System.out.println(contNeg + " valor(es) negativo(s)");
    }
}
