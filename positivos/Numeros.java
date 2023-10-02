package positivos;
import java.util.Scanner;

public class Numeros{
    private int cont = 0;
    private double media = 0;
    private double x;

    public void Calcular(){
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 6; i++){
            x = leitor.nextDouble();
            if(x > 0){
                cont++;
                media += x;
            }
        }
    }

    public int getCont(){
        return cont;
    }

    public double getMedia(){
        return media;
    }
}