public class MyStack<T>  extends MyArrayList<T> {
    private int size;
    public boolean empty(){
        return empty();
    }
    public T push(T newItem){
        addLast(newItem);
        return newItem;
    }
    public T peek(){
        return get(this.size - 1);
    }
    public T pop(){
        T removingItem = peek();
        removeLast();
        return removingItem;
    }
    public int getSize(){
        return this.size();
    }
}
