import java.util.Scanner;
public class PotenciaIterativo {
    public static double potencia(double base, double exponente){
        if(exponente == 0) {
            return 1;

        }else if(exponente < 0){
           double resultado = 1;
           double resultado2 = 1;
            for (int i = 1; i <= (exponente * - 1)   ; i++) {
                resultado = resultado * base;
            } return resultado2 / resultado;

        } else {
            double resultado = 1;
            for (int i = 1; i <= exponente ; i++) {
                resultado = resultado * base;
            } return resultado;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base");
        int base = sc.nextInt();
        System.out.println("Introduce el exponente");
        int exponente = sc.nextInt();
        System.out.printf("%n%d elevado a %d es igual a %.6f", base, exponente, potencia(base, exponente));
    }

}
