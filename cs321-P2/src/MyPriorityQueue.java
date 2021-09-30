public class MyPriorityQueue extend MaxHeap implements PriorityQueueInterface{
    @Override
    public void enqueue(Process p) {

    }

    @Override
    public Process dequeue() {

        return extractMax();
    }

    @Override
    public boolean isEmpty() {
        heapIsEmpty();
    }


    @Override
    public void update(Process next, int timeToIncrementPriority, int maxPriority) {

    }
}
