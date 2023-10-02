package various;
import java.util.Scanner;

public class Numbers {
    int numero;
    int contNeg = 0;
    int contPos = 0;
    int contEven = 0;
    int contOdd = 0;

    public void analyse(){
        Scanner leitor = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            numero = leitor.nextInt();
            if(numero % 2 == 0){
                contEven++;
            }
            if(numero % 2 != 0){
                contOdd++;
            }
            if(numero > 0){
                contPos++;
            }
            if(numero < 0){
                contNeg++;
            }
        }
    }

    public int getContEven(){
        return contEven;
    }

    public int getContOdd(){
        return contOdd;
    }

    public int getContPos(){
        return contPos;
    }

    public int getContNeg(){
        return contNeg;
    }
}
