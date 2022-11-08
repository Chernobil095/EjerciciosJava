public class FactorialRecursivo {
    // Metodo recursivo para el factorial de un numero
    public long factorial (long numero) {
        if (numero <= 1) // prueba para el caso base
            return 1;
        else // paso recursivo
            return numero * factorial(numero - 1);
    }

        // salida del factorial para los valores 0 - 10
        public void mostrarFactorial(){
        for (int contador = 0; contador <= 10; contador++) {
            System.out.printf("%d! = %d\n", contador, factorial(contador));
        }// Final del metodo mostrarFactirial
    }// Final de la clase FactorialRecursivo



    //Calcular factoriales de 0 - 10
    public static void main(String[] args) {
        FactorialRecursivo factorialRecursivo = new FactorialRecursivo();
        factorialRecursivo.mostrarFactorial();
    }

}



