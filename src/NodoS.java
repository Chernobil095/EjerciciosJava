public class NodoS {

        int info; // Informacion de la lista
        NodoS next;

        public NodoS (int info){
            this(info, null); // Hace un llamado al segundo constructor
        }

        public NodoS (int info, NodoS ref){
            this.info = info;
            next = ref;
    }
}
