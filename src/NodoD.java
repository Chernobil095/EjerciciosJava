public class NodoD <T>{
    T info;
    NodoD<T> next;
    NodoD<T> prev;

    public NodoD(T el){
        this(el,null,null);
    }

    public NodoD(T el, NodoD next, NodoD prev){
        info=el;
        this.next=next;
        this.prev=prev;
    }
}
