package Oop4_Assgn4;

import java.util.Iterator;

public class Node implements Iterable<Node>{
    int data;
    Node next;

    public Node(int v){
        this.data = v;
    }

    public Node(int v, Node n){
        this.data = v;
        this.next = n;
    }


    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }

    private  class NodeIterator implements Iterator<Node>{

        Node nn;

        public NodeIterator(Node n){
            this.nn = n;
        }

        @Override
        public boolean hasNext() {
            return nn.next != null;
        }

        @Override
        public Node next() {
            Node temp = nn;
            nn = nn.next;
            return temp;

        }
    }
}
