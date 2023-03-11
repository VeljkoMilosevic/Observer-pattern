/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.pattern.observer.news.main;

import desing.pattern.observer.inteface.Subscriber;
import desing.pattern.observer.news.impl.PublisherImpl;
import desing.pattern.observer.news.impl.SubscriberImpl;

/**
 * @author Veljko
 */
public class Main {

    public static void main(String[] args) {
        PublisherImpl publisher = new PublisherImpl();
        
        final Subscriber<String> subscriber1 = new SubscriberImpl("Subscriber1");
        publisher.subscribe(subscriber1);
        final Subscriber<String> subscriber2 = new SubscriberImpl("Subscriber2");
        publisher.subscribe(subscriber2);
        final Subscriber<String> subscriber3 = new SubscriberImpl("Subscriber3");
        publisher.subscribe(subscriber3);
        publisher.addNews("News number 1");

        publisher.unsubscribe(subscriber2);
        final Subscriber<String> subscriber4 = new SubscriberImpl("Subscriber4");
        publisher.subscribe(subscriber4);
        publisher.addNews("News number 2");
    }
}
