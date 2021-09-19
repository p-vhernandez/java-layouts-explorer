package components;

import javax.swing.*;

public class BottomBar extends JPanel {

    private final BottomBarUI view;

    public BottomBar() {
        this.view = new BottomBarUI(this);

        setUpUI();
    }

    private void setUpUI() {
        this.view.initializeUI();
    }

}
