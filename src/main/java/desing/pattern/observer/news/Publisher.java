package desing.pattern.observer.news;

public interface Publisher<T> {
    void subscribe(Subscriber<T> subscriber);
    void unsubscribe(Subscriber<T> subscriber);
    void notifyAllSubscribers(T news);
}
