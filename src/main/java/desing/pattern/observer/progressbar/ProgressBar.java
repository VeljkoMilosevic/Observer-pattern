package desing.pattern.observer.progressbar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import desing.pattern.observer.news.Subscriber;

import javax.swing.*;

/**
 *
 * @author Veljko
 */
public class ProgressBar extends JFrame implements Subscriber<Integer> {
    private JProgressBar progressBarComponent;
    private int progress;
    private String name;

    public ProgressBar(String name) {
        setProgressBarName(name);
        prepareView();
    }

    private void setProgressBarName(String name) {
        this.name = name;
    }
    private void prepareView() {
        this.setTitle(name);
        progressBarComponent = new JProgressBar(0, 100);
        progressBarComponent.setBounds(40, 40, 260, 30);
        progressBarComponent.setValue(0);
        progressBarComponent.setStringPainted(true);
        add(progressBarComponent);
        setSize(350, 150);
        setLayout(null);
    }

    public void update(Integer progress)  {
        this.progress = progress;
        progressBarComponent.setValue(this.progress);
        if (progress == 100) {
            this.dispose();
        }
    }
}
