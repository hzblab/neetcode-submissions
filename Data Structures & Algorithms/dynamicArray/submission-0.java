class DynamicArray {

    int size;
    int capacity;
    int[] arr;

    public DynamicArray(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.arr = new int[this.capacity];

    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;

    }

    public void pushback(int n) {
        if(size==capacity){
            resize();
        }
            arr[size] = n;   
            size++;

    }

    public int popback() {

        // if(size==0){
        //    throw new IllegalStateException("Array is empty."); 
        // }
        size--;
       return arr[size];

    }

    private void resize() {
        capacity*=2;
        int [] newarr = new int [capacity];
        for (int i=0; i<size; i++){
            newarr[i] = arr[i];
        }
       
        arr = newarr;

    }

    public int getSize() {
        return size;

    }

    public int getCapacity() {
        return capacity;

    }
}
