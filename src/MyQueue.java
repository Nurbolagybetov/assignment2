public class MyQueue<T> extends MyArrayList<T> {
    public int size;
    public T peek(){
        return get(0);
    }
    public T enqueue(T newItem){
        addBack(newItem);
        return newItem;
    }
    public T dequeue(){
        T removingItem = peek();
        removeFirst();
        return removingItem;
    }

    public boolean empty() {
        return empty();
    }
    public int size() {
        return this.size();
    }
    public void addBack(T newItem) {
        addLast(newItem);
    }
}
