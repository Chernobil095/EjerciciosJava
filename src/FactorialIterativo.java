public class FactorialIterativo {
        public void factorialIterativo(){
            long numero = 10;
            long factorial = 1;

            for (int i = 1; i <= numero ; i++) {
                factorial = factorial * i;
                System.out.printf("%d! = %d\n", i, factorial);
            }
        }
    public static void main(String[] args) {
        FactorialIterativo factorialIterativo = new FactorialIterativo();
        factorialIterativo.factorialIterativo();

    }
}
