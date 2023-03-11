/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.pattern.observer.news.impl;

import desing.pattern.observer.inteface.Publisher;
import desing.pattern.observer.inteface.Subscriber;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Veljko
 */
public class PublisherImpl implements Publisher<String> {
    private final List<Subscriber<String>> subscribers;

    public PublisherImpl() {
        subscribers = new LinkedList<>();
    }

    @Override
    public void subscribe(final Subscriber<String> subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(final Subscriber<String> subscriber) {
        subscribers.remove(subscriber);
    }

    public void addNews(final String news) {
        notifyAllSubscribers(news);
    }

    @Override
    public void notifyAllSubscribers(final String news) {
        System.out.println("Sending news to subscribers!");
        for (final Subscriber<String> subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}
