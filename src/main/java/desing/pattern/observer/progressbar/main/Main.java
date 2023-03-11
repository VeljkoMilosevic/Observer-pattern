package desing.pattern.observer.progressbar.main;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import desing.pattern.observer.progressbar.impl.ProgressBar;
import desing.pattern.observer.progressbar.impl.ServerPublisher;


/**
 * @author Veljko
 */
public class Main {

    public static void main(final String[] args) throws InterruptedException {
        final ServerPublisher server = new ServerPublisher();

        final ProgressBar subscriber1 = new ProgressBar("subscriber1");
        subscriber1.setVisible(true);
        server.subscribe(subscriber1);

        final ProgressBar subscriber2 = new ProgressBar("subscriber2");
        subscriber2.setVisible(true);
        server.subscribe(subscriber2);

        final ProgressBar subscriber3 = new ProgressBar("subscriber3");
        subscriber3.setVisible(true);
        server.subscribe(subscriber3);

        server.startProgress();
    }
}
