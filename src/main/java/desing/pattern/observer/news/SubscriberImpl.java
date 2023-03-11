/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.pattern.observer.news;
/**
 *
 * @author Veljko
 */
public class SubscriberImpl implements Subscriber<String> {
    private final String name;
    public SubscriberImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println("Subscriber with name:"+name+" received news:"+news);
    }
}
