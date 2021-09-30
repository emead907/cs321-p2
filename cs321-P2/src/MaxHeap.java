public class MaxHeap {

    //heap insert
        //Heap insert puts a new element in the last spot of the array and call increae key on that index
    //increase key - look at pg 185

    private int heapSize;
    private Process A[];

    public MaxHeap() {
        heapSize = 0;
        A = new Process[10];
    }

    public boolean headIsEmpty(){
        if(heapsize == 0){
            return true;
        }
        return false;
    }

    public void MaxHeapify(int index){
        int left = index + 1;
        int right = index + 2;

        int largest = -1;

        if(left < heapSize && A[left].compareTo(A[index]) == 0) {
            largest = left;
        }
        else {
            largest = index;
        }
        if (right < heapSize && A[right].compareTo(A[largest]) == 1) {
            largest = right;
        }

        if(largest != index) {
            swap(largest, index);
            MaxHeapify(largest);
        }


    }

    private void swap(int posOne, int posTwo) {
        Process placeholder = A[posOne];
        A[posOne] = A[posTwo];
        A[posTwo] = placeholder;
    }

    //return max, let it 0 call hepify return last one.

    public Process extractMax(){
        Process returnMe = A[0];

        return returnMe;
    }
    private Process extraxtMax()
    {
        if(heapSize < 1){
            System.out.println("Cant extract max on a emptty heap");
        }
        else {
            Process max = A[0];
            A[0] = A[heapSize];
            heapSize--;
            MaxHeapify(0);
            return max;
        }
    }

    public void increaseKey(int index, int prority){
        if(prority < A[index]){
            System.out.println("Key can only go up");
        }


        else {

        }
    }

    public void incertProcess(Process p){

    }
}


