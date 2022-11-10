import java.util.ArrayList;

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
    } // Inserta un elemento al inicio de la lista
    public void insFinal(int info){
        if (vacia())
            first = last = new NodoS(info);
        else {
            last.next = new NodoS(info);
            last = last.next;
        }
    } // Inserta un elemento al final de la lista
    public int borrarFrente(){
        if (!vacia()){
            NodoS temp = first;
            if(first == last){
                first = last = null;
            }else {
                first = first.next;
                temp.next = null;
            }
            return temp.info;
        }
            return -1;
    } // Borra el primer elemento
    public void imprimirLista(){
        for (NodoS temp = first; temp != null; temp = temp.next ){
            System.out.println(temp.info + " ");
        }
    } // Imprime Lista
    public boolean enLista(int info){
        NodoS tmp;
        for(tmp = first; tmp != null && tmp.info != info; tmp = tmp.next);
        return tmp != null;
    } //
    public  int borrarUltimo(){
        int info = last.info;
        if (first == last){ // Si hay un elemento en la lista
            first = last = null;
        } else { // Si hay mas de un nodo en la lista
            NodoS tmp;
            for (tmp = first; tmp.next != last; tmp = tmp.next);
            last = tmp;
            last.next = null;
        } return info;
    } //



    public static void main(String[] args) {
        ListaS l = new ListaS();
        l.insFrente(5);
        l.insFrente(6);
        l.insFrente(7);
        l.insFinal(8);
        l.insFinal(3);
        l.borrarUltimo();
        l.imprimirLista();
        System.out.println();



    }

}
