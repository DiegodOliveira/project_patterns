package various;

public class Main_Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.analyse();

        System.out.println(numbers.contEven + " valor(es) par(es)");
        System.out.println(numbers.contOdd + " valor(es) ímpar(es)");
        System.out.println(numbers.contPos + " valor(es) positivo(s)");
        System.out.println(numbers.contNeg + " valor(es) negativo(s)");
    }
}
