package BehaviorPattern.IteratorPattern;

public interface ItemIterator<T> {
    boolean hasNext();
    T next();
}
