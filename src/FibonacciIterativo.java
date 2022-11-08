public class FibonacciIterativo {
    public void fibonacci(){
        int a = 0;
        int b = 1;
        int c;
        int n = 10;

        for (int i = 0; i <= n; i++) {
            System.out.printf("Fibonacci de %d es: %d\n", i, a);
            c = a + b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        FibonacciIterativo fibonacciIterativo = new FibonacciIterativo();
        fibonacciIterativo.fibonacci();
    }
}
