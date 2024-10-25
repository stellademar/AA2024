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
    /*El código busca el mayor factor primo de un número entero $n$ de manera recursiva. Si $n$ es 1, retorna 1 como caso base. Si $n$ es divisible por $d$, verifica si $n/d$ es 1; si es así, retorna $d$ como el mayor factor primo, o llama a la función con $n/d$ si no. Si $n$ no es divisible por $d$, incrementa $d$ en 1 y llama a la función nuevamente. Finalmente, devuelve el mayor factor primo encontrado en el proceso.*/
    /*T(n,d) = 
\begin{cases} 
1 & \text{si } n = 1 \\ 
T(n/d, d) & \text{si } n \; MOD \; d = 0 \\ 
T(n, d+1) & \text{si } n \; MOD \; d \; \neq 0 
\end{cases}*/
}
