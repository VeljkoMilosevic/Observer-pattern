package desing.pattern.observer.news;

public interface Subscriber<T> {
    void update(T news);
}
