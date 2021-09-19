package components;

import utils.Utils;

import javax.swing.*;
import java.awt.*;

public class BottomBarUI {

    private final BottomBar bottomBar;

    private final JLabel infoLabel;

    public BottomBarUI(BottomBar bottomBar) {
        this.bottomBar = bottomBar;
        this.infoLabel = new JLabel();
    }

    public void initializeUI() {
        bottomBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        bottomBar.setPreferredSize(new Dimension(Utils.getScreenWidth(),
                Utils.getBottomBarHeight()));
        bottomBar.setMaximumSize(bottomBar.getPreferredSize());
        bottomBar.setBackground(Color.white);

        infoLabel.setText("This would display the selected elements");
        bottomBar.add(infoLabel);
    }

}
