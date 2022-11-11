public class ListaS {

    NodoS first, last;

    public ListaS(){
        first = last = null;
    }

    public boolean vacia(){
        return first == null;
    }

    public void insFrente(int info){
        if(vacia())
            first = last = new NodoS(info);
        else {
           first = new NodoS(info, first);
        }
    }

    public static void main(String[] args) {
        ListaS l = new ListaS();
        l.insFrente(5);
        l.insFrente(6);
        l.insFrente(7);
        System.out.println();
    }

}
