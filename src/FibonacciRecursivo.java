public class FibonacciRecursivo {

    // Declaracion del metodo de fibonacci
    public long fibonacci ( long numero){
        if ((numero == 0) || (numero == 1)){
            return  numero;
        }else // Paso de recursion
            return fibonacci(numero - 1) + fibonacci(numero - 2);
    } // Fin del metodo de fibonacci

    public void mostrarFibonacci(){
        for (int contador = 0; contador <=10; contador++) {
            System.out.printf("Fibonacci de %d es: %d\n", contador, fibonacci(contador));
        }
    }// Fin del metodo mostrarFibonacci

    public static void main(String[] args) {
        FibonacciRecursivo fibonacciRecursivo = new FibonacciRecursivo();
        fibonacciRecursivo.mostrarFibonacci();
    }
}// fin de la clase FibonacciRecursivo
