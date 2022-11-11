public class ListaLC {
    NodoLC last;

    public ListaLC (){
        last = null;
    }
    public boolean vacia(){
        return last == null;
    } // Metodo para saber si la lista esta vacia

    public ListaLC agregarElemento (int dato){
        NodoLC nuevoNodo = new NodoLC(dato);
        if(last != null){
            nuevoNodo.next = last.next;
            last.next = nuevoNodo;
        }
        last = nuevoNodo;
        return this;
    } // Metodo para agregar elemento a la lista

    public void mostrarLista(){
       NodoLC tmp = last.next;
       String lista = "";
       do{
          lista = lista + tmp.dato + "\n";
          tmp = tmp.next;

       }while (tmp != last.next);
        System.out.println(lista + " ");


       }// Metodo para mostrar los elementos de la lista

    public boolean eliminar(int dato){
            NodoLC tmp;
            boolean find = false;
            tmp = last;
            while (tmp.next != last && !find){
                find = (tmp.next.dato == dato);
                if(!find){
                    tmp = tmp.next;
                }
            }
            find = (tmp.next.dato == dato);
            if(find){
                NodoLC aux = tmp.next;
                if(last == last.next){
                    last = null;
                }else {
                    if(aux == last){
                        last = tmp;
                    }
                    tmp.next = aux.next;
                }
                aux = null;
            }  return  find == true;
    }


    public static void main(String[] args) {
        ListaLC lc = new ListaLC();
        lc.agregarElemento(6);
        lc.agregarElemento(8);
        lc.agregarElemento(45);
        lc.agregarElemento(4);
        lc.eliminar(8);
        lc.mostrarLista();
        lc.eliminar(6);
        System.out.println(lc.vacia());
        lc.mostrarLista();
    }
}