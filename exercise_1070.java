import java.util.Scanner;

public class exercise_1070 {
    public static void main(String[] args) {
        int valorInteiro, contador;
        Scanner leitor = new Scanner(System.in);
        valorInteiro = leitor.nextInt();

        contador = 0;
        while(contador < 6){
            if (valorInteiro % 2 == 1){
                System.out.println(valorInteiro);
                contador++;
            }
            valorInteiro++;
        }

    }
}
