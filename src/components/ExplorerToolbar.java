package components;

import javax.swing.*;

public class ExplorerToolbar extends JToolBar {

    private final ExplorerToolbarUI view;

    public ExplorerToolbar() {
        this.view = new ExplorerToolbarUI(this);

        setFloatable(false);
        setUpUI();
    }

    private void setUpUI() {
        this.view.initializeUI();
    }

}
