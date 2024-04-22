import java.util.Iterator;

public interface MyIterator<T> extends Iterator<T> {
    boolean hasNext();
    T next();

    @Override
    default void remove() {
        Iterator.super.remove();
    }
}


