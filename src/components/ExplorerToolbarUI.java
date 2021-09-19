package components;

import utils.Utils;

import javax.swing.*;
import java.awt.*;

public class ExplorerToolbarUI {

    private final ExplorerToolbar toolbar;

    private final JButton btnFile;
    private final JButton btnEdit;
    private final JButton btnShare;
    private final JButton btnView;

    public ExplorerToolbarUI(ExplorerToolbar toolbar) {
        this.toolbar = toolbar;

        this.btnFile = new JButton();
        this.btnEdit = new JButton();
        this.btnShare = new JButton();
        this.btnView = new JButton();
    }

    public void initializeUI() {
        toolbar.setPreferredSize(new Dimension(Utils.getScreenWidth(),
                Utils.getToolbarHeight()));
        toolbar.setMaximumSize(toolbar.getPreferredSize());
        toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));

        setUpToolbarMenu();
    }

    private void setUpToolbarMenu() {
        btnFile.setText("File");
        btnEdit.setText("Edit");
        btnShare.setText("Share");
        btnView.setText("View");

        toolbar.add(btnFile);
        toolbar.add(btnEdit);
        toolbar.add(btnShare);
        toolbar.add(btnView);
    }

}
