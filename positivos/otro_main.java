package positivos;

public class otro_main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        numeros.Calcular();

        System.out.println(numeros.getCont() + " valores postivos");
        System.out.println(String.format("%.1f", numeros.getMedia()));
    }
}
