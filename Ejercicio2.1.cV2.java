//Todo numero, tiene al menos un factor primo, y si esto no pasa, el numero es primo
public class Ejercicio2c {
    public static void main(String[] args) {
        System.out.println(mayorPrimo(13195, (int) 13195 / 2));
    }

    public static int mayorPrimo(int n, int actual) {
        // Precondicion: n debe ser positivo, actual debe comenzar como la mitad de n
        int mayor = 1;

        if (actual > 1) {
            if (esPrimo(actual) && n % actual == 0) {
                mayor = actual;
            } else {
                mayor = mayorPrimo(n, actual - 1);
            }
        }

        if (mayor == 1) {
            mayor = n;
        }

        return mayor;
    }

    public static boolean esPrimo(int n) {
        boolean primo = true;
        int i = 2;

        while (i * i <= n && primo) {
            if (n % i == 0) {
                primo = false;
            }
            i++;
        }

        return primo;
    }
}
