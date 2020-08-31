package task3209.listeners;

import task3209.View;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class TabbedPaneChangeListener implements ChangeListener {
    public TabbedPaneChangeListener(View view) {
        this.view = view;
    }

    private View view;

    public void stateChanged(ChangeEvent e) {
        view.selectedTabChanged();

    }
}
