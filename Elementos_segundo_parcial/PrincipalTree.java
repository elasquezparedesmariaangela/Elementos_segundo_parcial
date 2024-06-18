import java.util.*;
public class PrincipalTree
{
    public static void mirarArbol(Tree<String> root) {
        if (root == null) {
            return;
        }

        Queue<Tree<String>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            // Imprimir todos los nodos del nivel actual
            for (int i = 0; i < levelSize; i++) {
                Tree<String> currentNode = queue.remove();
                System.out.print(currentNode.data + " ");

                // Añadir hijos del nodo actual a la cola
                for (Tree<String> child : currentNode.childs) {
                    queue.add(child);
                }
            }
            System.out.println();
        }
    }
    
    
    public static void main() {
        Tree<String> c = new Tree<String>("c");
        Tree<String> a = new Tree<String>("a");
        Tree<String> u1 = new Tree<String>("u");
        Tree<String> h = new Tree<String>("h");
        Tree<String> t1 = new Tree<String>("t");
        Tree<String> t2 = new Tree<String>("t");
        Tree<String> e = new Tree<String>("e");
        Tree<String> u2 = new Tree<String>("u");
        
        // hijos principal
        c.addChild(a);
        c.addChild(u1);
        c.addChild(h);
        
        // hijos nivel 2
        a.addChild(t1);
        u1.addChild(t2);
        h.addChild(e);
        h.addChild(u2);
        
        // hijos nivel 3
        t1.addChild("s");
        t2.addChild("p");
        t2.addChild("e");
        u2.addChild("i");
        u2.addChild("s");
        
        mirarArbol(c);
    }
}
