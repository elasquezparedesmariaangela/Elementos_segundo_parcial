
public class NodoEnteros
{
    private int valor;
    private NodoEnteros siguiente;
    public NodoEnteros(){
        this.valor = valor;
        this.siguiente = siguiente;
    }
    
    public NodoEnteros(int valor){
        this.valor = valor;
        this.siguiente = null;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public NodoEnteros getSiguiente(){
        return this.siguiente;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public void setSiguiente(NodoEnteros siguiente){
        this.siguiente = siguiente;
    }
}
