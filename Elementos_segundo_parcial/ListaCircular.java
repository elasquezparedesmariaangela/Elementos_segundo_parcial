public class ListaCircular
{
   NodoEnteros inicio;
   public ListaCircular(){
       inicio = null;
   }
   
   public void anadir(int valor){
       NodoEnteros nuevoNodo = new NodoEnteros(valor);
       if (inicio == null ){
           inicio = nuevoNodo;
           inicio.setSiguiente(inicio);
       }else{
           NodoEnteros ultimo = buscarUltimo();
           ultimo.setSiguiente(nuevoNodo);
           nuevoNodo.setSiguiente(inicio);
       }
   }
   
   public NodoEnteros buscarUltimo(){
       NodoEnteros ultimo = inicio;
       while(ultimo.getSiguiente() != inicio){
             ultimo = ultimo.getSiguiente();
        }
       return ultimo;
   }
   
   public void imprimirLista(){
       NodoEnteros ultimo = inicio;
       while(ultimo.getSiguiente() != inicio){
            System.out.print(ultimo.getValor()+ " -> ");
            ultimo = ultimo.getSiguiente();
       }
       System.out.print(ultimo.getValor());
       System.out.println();
   }
   
   public NodoEnteros buscarNodoAnterior(int posb){
       NodoEnteros buscar = inicio;
       int pos = 0;
       while(buscar.getSiguiente() != inicio && pos < posb - 1){
             buscar = buscar.getSiguiente();
             pos = pos+1;
       }
       return buscar;
   }
   
   public void swap(int pos1, int pos2){
       if(pos1 == pos2){
           return;
       }else {
           NodoEnteros nodoAnterior1 = buscarNodoAnterior(pos1);
           System.out.println("nodo anterior1 = " + nodoAnterior1.getValor());
           NodoEnteros nodoActual1 = nodoAnterior1.getSiguiente();
           System.out.println("nodo actual1 = " + nodoActual1.getValor());
           NodoEnteros nodoAnterior2 = buscarNodoAnterior(pos2);
           System.out.println("nodo anterior2 = " + nodoAnterior2.getValor());
           NodoEnteros nodoActual2 = nodoAnterior2.getSiguiente();
           System.out.println("nodo actual2 = " + nodoActual2.getValor());
           nodoAnterior1.setSiguiente(nodoActual2);
           nodoAnterior2.setSiguiente(nodoActual1);
           NodoEnteros siguiente2 = nodoActual2.getSiguiente();
           nodoActual2.setSiguiente(nodoActual1.getSiguiente());
           nodoActual1.setSiguiente(siguiente2);
       }
   }
}
