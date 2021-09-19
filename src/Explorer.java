import utils.Utils;

import javax.swing.*;

public class Explorer extends JFrame {

    private final ExplorerUI view;

    public Explorer() {
        this.view = new ExplorerUI(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUpAppIcon();
        setUpUI();

        pack();
    }

    private void setUpAppIcon() {
        setIconImage(Utils.generateImage(this,
                "resources/img/folder.png"));
    }

    private void setUpUI() {
        this.view.initializeUI();
    }

}
