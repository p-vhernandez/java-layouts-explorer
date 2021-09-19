import components.*;
import utils.Utils;

import javax.swing.*;
import java.awt.*;

public class ExplorerUI {

    private final Explorer explorer;

    public ExplorerUI(Explorer explorer) {
        this.explorer = explorer;
    }

    public void initializeUI() {
        explorer.setTitle(Utils.getAppName());
        explorer.setPreferredSize(new Dimension(Utils.getScreenWidth(),
                Utils.getScreenHeight()));
        explorer.setLayout(new BorderLayout());

        setUpToolbar();
        setUpSideMenu();
        setUpBottonBar();
        setUpMainSections();
    }

    private void setUpToolbar() {
        ExplorerToolbar toolbar = new ExplorerToolbar();
        explorer.add(toolbar, BorderLayout.NORTH);
    }

    private void setUpSideMenu() {
        SideMenu sideMenu = new SideMenu();
        explorer.add(sideMenu, BorderLayout.WEST);
    }

    private void setUpBottonBar() {
        BottomBar bottomBar = new BottomBar();
        explorer.add(bottomBar, BorderLayout.SOUTH);
    }

    private void setUpMainSections() {
        JPanel mainSections = new JPanel();
        mainSections.setLayout(new BoxLayout(mainSections, BoxLayout.PAGE_AXIS));

        setUpMainPanel(mainSections);
        setUpRecentlyViewedPanel(mainSections);

        explorer.add(mainSections, BorderLayout.CENTER);
    }

    private void setUpMainPanel(JPanel mainSections) {
        MainPanel mainPanel = new MainPanel();
        mainSections.add(mainPanel);
    }

    private void setUpRecentlyViewedPanel(JPanel mainSections) {
        RecentlyViewed recentlyViewed = new RecentlyViewed();
        mainSections.add(recentlyViewed);
    }

}
