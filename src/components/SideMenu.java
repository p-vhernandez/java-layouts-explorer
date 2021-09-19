package components;

import javax.swing.*;

public class SideMenu extends JPanel {

    private final SideMenuUI view;

    public SideMenu() {
        this.view = new SideMenuUI(this);

        setUpUI();
    }

    private void setUpUI() {
        this.view.initializeUI();
    }

}
