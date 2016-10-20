import java.util.LinkedList;
import java.util.Queue;

public class RightNode {
    public RightNode[] Children;
    public RightNode Right;
    int data;


    public static void setRight(RightNode node) {
        Queue<RightNode> curr = new LinkedList<>();
        Queue<RightNode> nxt = new LinkedList<>();
        curr.add(node);
        while (!curr.isEmpty()) {
            RightNode i = curr.remove();
            if (i.Children != null) {
                for (RightNode childNode : i.Children) {
                    nxt.add(childNode);
                }
            } else {
                System.out.println(i.data + " No Children");
            }

            if (curr.isEmpty()) {
                //do work
                RightNode left = null;
                for (RightNode y : nxt) {
                    if (left != null) {
                        left.Right = y;
                    }
                    left = y;

                }
                //
                curr = nxt;
                nxt = new LinkedList<>();
            }
        }
    }
    public static void main (String[] args){
        RightNode a = new RightNode();
        RightNode b = new RightNode();
        RightNode c = new RightNode();
        RightNode d = new RightNode();
        RightNode e = new RightNode();
        RightNode f = new RightNode();
        RightNode g = new RightNode();
        a.data = 1;
        b.data = 2;
        c.data = 3;
        d.data = 4;
        e.data = 5;
        f.data = 6;
        g.data = 7;
        a.Children = new RightNode[2];
        a.Children[0] = b;
        a.Children[1] = c;
        b.Children = new RightNode[3];
        b.Children[0] = d;
        b.Children[1] = e;
        b.Children[2] = f;
        c.Children = new RightNode[1];
        c.Children[0] = g;
        setRight(a);
        System.out.println("Node a, Data: "+a.data+", Right: "+a.Right);
        System.out.println("Node b, Data: "+b.data+", Right: "+b.Right.data);
        System.out.println("Node c, Data: "+c.data+", Right: "+c.Right);
        System.out.println("Node d, Data: "+d.data+", Right: "+d.Right.data);
        System.out.println("Node e, Data: "+e.data+", Right: "+e.Right.data);
        System.out.println("Node f, Data: "+f.data+", Right: "+f.Right.data);
        System.out.println("Node g, Data: "+g.data+", Right: "+g.Right);




    }

}