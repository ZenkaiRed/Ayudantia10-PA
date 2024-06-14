public class Main {
    public static void main(String[] args) {
        // 1.- Factorial.
        System.out.println(factorial(5));
        // 2.- Fibonacci.
        System.out.println(fibonacci(7));
        // 3.- Potencia.
        System.out.println(potencia(2,3));
        // 4.- Invertir cadena.
        System.out.println(invertir("Hacka DISC"));
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static int fibonacci(int n) {
        // Si el número es negativo retornamos el mismo número.
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static double potencia(int base, int exponente) {

        // Condición de término.
        if (exponente == 0) {
            return 1;
        }

        // Caso en que el exponente sea negativo.
        if (exponente < 0) {
            return (double) 1 / base * potencia(base, exponente + 1);
        }

        return base * potencia(base, exponente - 1);
    }

    private static String invertir(String cadena) {

        // Verificamos si la cadena está vacía.
        if (cadena.isEmpty()) { return cadena; }

        // Retornamos la cadena invertida.
        return invertir(cadena.substring(1)) + cadena.charAt(0);
    }


}