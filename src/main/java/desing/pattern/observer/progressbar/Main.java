package desing.pattern.observer.progressbar;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Veljko
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ServerPublisher server = new ServerPublisher();

        ProgressBar subscriber1 = new ProgressBar("subscriber1");
        subscriber1.setVisible(true);
        server.subscribe(subscriber1);

        ProgressBar subscriber2 = new ProgressBar("subscriber2");
        subscriber2.setVisible(true);
        server.subscribe(subscriber2);

        ProgressBar subscriber3 = new ProgressBar("subscriber3");
        subscriber3.setVisible(true);
        server.subscribe(subscriber3);

        server.startProgress();
    }
}
