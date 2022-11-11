public class ListaD <T> {
    NodoD<T> first, last;

    public ListaD(){
        first=last=null;
    }

    public boolean vacia(){
        return first==null;
    }

    public void insertarFinal(T el){
        if(vacia()){
            first=last=new NodoD(el);
        }else{
            last=new NodoD(el,null,last);
            last.prev.next=last;
        }
    }

    public void insertarFrente(T el){
        if(vacia()){
            first=last=new NodoD(el);
        }else{
            first=new NodoD(el,first,null);
            first.next.prev=first;
        }
    }

    public T eliminarFinal(){
        if(!vacia()){
            T info= last.info;
            if(first==last)
                first=last=null;
            else {
                last=last.prev;
                last.next.prev=null;
                last.next=null;
            }
            return info;
        }else
            return null;
    }

    public void imprime(){
        for(NodoD el=first;el!=null;el=el.next){
            System.out.print(" "+el.info);
        }
        System.out.println();
    }

    public T eliminarFrente(){
        if(!vacia()){
            T el=first.info;
            if(first==last)
                first=last=null;
            else{
                first=first.next;
                first.prev=null;
            }
            return el;
        }else
            return null;
    }

    public void eliminar(T el){
        if(!vacia()){
            if(first==last)
                first=last=null;
            else {
                // todo 2 elementos en la lista
                NodoD<T> tmp;
                for(tmp=first;tmp!=null && tmp.info!=el;tmp=tmp.next){}
                if(first.info==el)
                    eliminarFrente();
                else if(last.info==el)
                    eliminarFinal();
                else if(tmp!=null){
                    tmp.prev.next=tmp.next;
                    tmp.next.prev=tmp.prev;
                }
            }
        }
    }
}
