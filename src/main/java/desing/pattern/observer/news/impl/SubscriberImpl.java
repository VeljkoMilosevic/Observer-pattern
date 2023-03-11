/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.pattern.observer.news.impl;

import desing.pattern.observer.inteface.Subscriber;

/**
 * @author Veljko
 */
public class SubscriberImpl implements Subscriber<String> {
    private final String name;

    public SubscriberImpl(final String name) {
        this.name = name;
    }

    @Override
    public void update(final String news) {
        System.out.printf("Subscriber with name:%s received news: %s%n", name, news);
    }
}
