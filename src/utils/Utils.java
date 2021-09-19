package utils;

import javax.swing.*;
import java.awt.*;

public class Utils {

    private static final int SCREEN_WIDTH = 800;
    private static final int SCREEN_HEIGHT = 600;
    private static final int TOOLBAR_HEIGHT = 40;
    private static final int SIDE_MENU_WIDTH = 150;
    private static final int BOTTOM_BAR_HEIGHT = 25;
    private static final int MAIN_PANEL_HEIGHT = 300;

    private static final String APP_NAME = "Explorer";

    public static int getScreenWidth() {
        return SCREEN_WIDTH;
    }

    public static int getScreenHeight() {
        return SCREEN_HEIGHT;
    }

    public static int getToolbarHeight() {
        return TOOLBAR_HEIGHT;
    }

    public static int getSideMenuWidth() {
        return SIDE_MENU_WIDTH;
    }

    public static int getBottomBarHeight() {
        return BOTTOM_BAR_HEIGHT;
    }

    public static int getMainPanelWidth() {
        return SCREEN_WIDTH - SIDE_MENU_WIDTH;
    }

    public static int getMainPanelHeight() {
        return MAIN_PANEL_HEIGHT;
    }

    public static int getRecentlyViewedPanelHeight() {
        return SCREEN_HEIGHT - BOTTOM_BAR_HEIGHT - MAIN_PANEL_HEIGHT;
    }

    public static String getAppName() {
        return APP_NAME;
    }

    public static Image generateImage(Object object, String directory) {
        return Toolkit.getDefaultToolkit()
                .getImage(object.getClass().getResource(directory));
    }

    public static JButton generateIconButton(Object object, String imgName, String btnText, boolean vertical) {
        String directory = "../resources/img/" + imgName + ".png";
        Image image = generateImage(object, directory);

        JButton button = new JButton(btnText, new ImageIcon(image));
        button.setIcon(new ImageIcon(image));
        button.setText(btnText);

        if (vertical) {
            button.setHorizontalTextPosition(SwingConstants.CENTER);
            button.setVerticalTextPosition(SwingConstants.BOTTOM);
        } else {
            button.setHorizontalTextPosition(SwingConstants.RIGHT);
        }

        return button;
    }

}
