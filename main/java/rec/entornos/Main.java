package rec.entornos;

public class Main {

    public static void main(String[] args) {
        // Valor Absoluto
        System.out.println("El valor absoluto de -20.3 es: " + Mates.valorAbsoluto(-20.3));
        System.out.println("El valor absoluto de 20.3 es: " + Mates.valorAbsoluto(20.3));

        // Factorial
        int numParaFactorial = 5;
        System.out.println("El factorial de 5 es: " + Mates.factorial(5));

        // Mitad y Tercio
        System.out.println("La mitad de 7 es: " + Fraccion.mitad(7));
        System.out.println("El tercio de 7 es: " + Fraccion.tercio(7));
    }
}
