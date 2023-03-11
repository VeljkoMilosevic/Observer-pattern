package desing.pattern.observer.progressbar.impl;

import desing.pattern.observer.inteface.Publisher;
import desing.pattern.observer.inteface.Subscriber;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Veljko
 */
public class ServerPublisher implements Publisher<Integer> {
    private final List<Subscriber<Integer>> subscribers;
    private final Random random;

    private static final int HALF_SECONDS_IN_MILLIS = 500;

    public ServerPublisher() {
        this.subscribers = new LinkedList<>();
        random = new Random();
    }

    @Override
    public void subscribe(final Subscriber<Integer> subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(final Subscriber<Integer> subscriber) {
        subscribers.remove(subscriber);
    }

    public void startProgress() throws InterruptedException {
        for (int progressPercentage = 0; progressPercentage <= 100; progressPercentage++) {
            notifyAllSubscribers(progressPercentage);
            Thread.sleep(random.nextInt(HALF_SECONDS_IN_MILLIS));
        }
    }

    @Override
    public void notifyAllSubscribers(final Integer progressPercentage) {
        for (final Subscriber<Integer> subscriber : subscribers) {
            subscriber.update(progressPercentage);
        }
    }
}
