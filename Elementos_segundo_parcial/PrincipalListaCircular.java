public class PrincipalListaCircular
{
   public static void main() {
        ListaCircular lista = new ListaCircular();
        lista.anadir(7);
        lista.anadir(3);
        lista.anadir(4);
        lista.anadir(5);
        lista.anadir(0);
        lista.anadir(2);
        lista.anadir(8);
        lista.imprimirLista();
        lista.swap(1,6);
        lista.imprimirLista();
   }
}
