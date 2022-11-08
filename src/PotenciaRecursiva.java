import java.util.Scanner;
public class PotenciaRecursiva {
    public static double potencia(double base, double exponente){
        if(exponente == 0) {
            return 1;
        }else if(exponente < 0){
            return potencia(base, exponente + 1 ) / base;
        } else {
            return base * potencia(base, exponente - 1);
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