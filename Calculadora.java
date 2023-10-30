public class Calculadora {
    // Nesta parte do código coloquei ambas variáveis a e b em uma mesma linha.
    private int a, b;

    public void calculadora(int a, int b){
        this.a = a;
        this.b = b;
    }

    /* Nos métodos adiante ,
    invés de deixar em siglas ou em poucas letras,
    coloquei em português
    para facilitar a leitura.
     */
    public int somar(){
        return a + b;
    }

    public int subtrair(){
        return a - b;
    }

    public int multiplicar(){
        return a * b;
    }

    // Aqui considerei mais lógico definir que se o dividendo for zero retornar 0 e uma exceção.
    public int dividir(){
        if (b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }
}
