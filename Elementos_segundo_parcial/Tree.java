import java.util.ArrayList;
public class Tree<T>
{
    public ArrayList<Tree<T>> childs;
    public T data;
    
    public Tree(){
        this.data = null;
        this.childs = new ArrayList<Tree<T>>();
    }
    
    public Tree(T data){
        this.data = data;
        this.childs = new ArrayList<Tree<T>>();
    }
    
    public void addChild(T data){
        Tree<T> nuevoHijo = new Tree<T>(data);
        this.childs.add(nuevoHijo);
    }
    
    public void addChild(Tree<T> nuevoHijo){
        this.childs.add(nuevoHijo);
    }
}
