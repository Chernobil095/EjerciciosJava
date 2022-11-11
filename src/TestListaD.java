public class TestListaD {
    public static void main(String[] args) {
        ListaD<Double> l=new ListaD();
        l.insertarFinal(1.3);
        l.insertarFinal(2.4);
        l.insertarFinal(3.5);
        l.insertarFinal(4.0);
        l.insertarFinal(5.3);
        l.imprime();
        System.out.println("eliminado:"+l.eliminarFinal());
        l.imprime();
        System.out.println("eliminado"+l.eliminarFrente());
        l.imprime();
        System.out.println();
        System.out.printf("eliminado");
        l.eliminar(4.0);
        l.imprime();

    }
}
