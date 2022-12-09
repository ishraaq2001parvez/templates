import java.util.*; 

class Main{
    public class VectorDemo{
        Vector<Integer> arr = new Vector<Integer>(); 
        
    }
    public class PriorityQueueDemo{
        PriorityQueue<E> pq = new PriorityQueue<E>();
        PriorityQueue<E> pq = new PriorityQueue<E>(Collection<E> c);
        PriorityQueue<E> pq = new PriorityQueue<E>(int initialCapacity);
        PriorityQueue<E> pq = new PriorityQueue(int initialCapacity, Comparator<E> comparator);
        PriorityQueue<E> pq = new PriorityQueue(PriorityQueue<E> c);
        pq.add(1); // adds element
        pq.peek(); // returns top
        pq.poll(); //returns top and pops
        pq.clear(); 
        pq.contains(k); 
        pq.isEmpty(); 
    }
    public static void main(String[] args){
        return 0;
    }
}