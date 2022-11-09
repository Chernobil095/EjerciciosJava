public class TorreHanoi {
    static
    void hanoi(int n, int torre1, int torre2, int torre3 ){
        if ( n == 1)
            System.out.println("Mover disco " + n + " desde Torre " +
                    torre1 + " a Torre " + torre3);
        else
        {
            hanoi(n -1, torre1, torre3, torre2);
            System.out.println("Mover disco " + n + " desde Torre " +
                    torre1 + " a Torre " + torre3);
            hanoi(n - 1, torre2, torre1, torre3);
        }
    }

    public static void main(String[] args) {
        hanoi(3,1,2,3);
    }
}
