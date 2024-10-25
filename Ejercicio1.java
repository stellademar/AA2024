public class Ejercicio1 {
    public static void main(String[] args) {
        fibonacciIte(50);
        //fibonacciRec(50);
    }

    public static long fibonacciIte(long n) {
        // Precondicion: n debe ser positivo
        long ultimo = 1, anteultimo = 1, fib = 1;

        for (long cont = n; cont > 2; cont--) {
            fib = ultimo + anteultimo;
            anteultimo = ultimo;
            ultimo = fib;
        }

        return fib;
    }

    public static long fibonacciRec(long n) {
        // Precondicion: n debe ser positivo
        long fib;

        if (n > 2) {
            fib = fibonacciRec(n - 1) + fibonacciRec(n - 2);
        } else {
            fib = 1;
        }

        return fib;
    }
}
