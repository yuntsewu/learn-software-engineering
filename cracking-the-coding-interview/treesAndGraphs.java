import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ytw on 9/26/16.
 */
public class treesAndGraphs {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    class Node {
        String name;
        Node[] children;
        Boolean visited = false;
    }

    class Graph {
        Node[] children;


        boolean search(Graph g, Node a, Node b) {
            //directed graph, design an algorithm to find out whether there is a route between two nodes
            for (Node c : g.children) {
                c.visited = false;
            }
            Queue<Node> queue = new LinkedList<>();
            a.visited = true;
            queue.add(a);
            Boolean found = compareNodes(a, b);

            while (!queue.isEmpty() && !found) {
                Node r = queue.remove();
                found = compareNodes(r, b);
                for (Node n : r.children) {
                    n.visited = true;
                    queue.add(n);
                }
            }
            return found;
        }

        boolean compareNodes(Node a, Node b) {
            return a.name.equals(b.name);
        }

        void visit(Node n) {
            //Do something
            System.out.println(n.name);
        }
    }

}
