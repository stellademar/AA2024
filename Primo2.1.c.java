public class Primo {
public static int mayorFactorPrimo(int n, int d) {
    int resultado;

    if (n == 1) {
        resultado = 1;
    } else if (n % d == 0) {
        if (n / d == 1) {
            resultado = d;
        } else {
            resultado = mayorFactorPrimo(n / d, d);
        }
    } else {
        resultado = mayorFactorPrimo(n, d + 1);
    }

    return resultado;
}
}
