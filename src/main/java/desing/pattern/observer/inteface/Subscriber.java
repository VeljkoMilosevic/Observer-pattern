package desing.pattern.observer.inteface;

public interface Subscriber<T> {
    void update(T news);
}
