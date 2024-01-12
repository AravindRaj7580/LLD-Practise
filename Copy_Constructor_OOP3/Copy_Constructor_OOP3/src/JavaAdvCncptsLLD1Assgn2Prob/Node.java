package JavaAdvCncptsLLD1Assgn2Prob;

import java.util.Iterator;

public class Node implements Iterable<Integer>{
    private int data;
    private Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new pIterator(this);
    }
    public class pIterator implements Iterator<Integer>{
        private Node current;

        public pIterator(Node n){
            this.current = n;
        }

        @Override
        public boolean hasNext() {
            return current.next != null;
        }

        @Override
        public Integer next() {
            Node nn = this.current;
            current = nn.next;
            return current.data;
        }
    }
}
